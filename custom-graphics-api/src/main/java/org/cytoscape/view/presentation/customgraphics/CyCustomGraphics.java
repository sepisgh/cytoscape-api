package org.cytoscape.view.presentation.customgraphics;

import java.awt.Image;
import java.util.List;


/**
 * Base interface for all Custom Graphics.
 *
 */
public interface CyCustomGraphics<T extends CustomGraphicLayer> {
		
	/**
	 * Immutable session-unique identifier of image generated in constructor.
	 * 
	 * NOT globally unique.  Uniqueness is guaranteed in a session.
	 * 
	 * @return Immutable ID as Long.
	 */
	public Long getIdentifier();
	
	/**
	 * Display name is a simple description of this image object.
	 * May not be unique and mutable.
	 * 
	 * @return display name as String.
	 */
	public String getDisplayName();
	
	
	/**
	 * Set human readable display name.
	 * 
	 * @param displayName
	 */
	public void setDisplayName(final String displayName);
	
	/**
	 * Generate a string suitable for serializing the state of this
	 * custom graphic.
	 * 
	 * @return serialized custom graphic state.  Note that the first part of this
	 *         <b>must</b> be the class of the implementing object followed by a 
	 *         comma.  This is used by the deserialization logic to recreate the
	 *         factory objects.
	 */
	public String toSerializableString();
	
	/**
	 * Get layers that belong to this object.
	 * 
	 * @return Collection of layer objects (in this version, it's CustomGraphicLayers from Ding)
	 * 
	 */
	public List<T> getLayers();
	
	
	/**
	 * Returns width of current object.
	 * 
	 * @return
	 */
	public int getWidth();
	
	
	/**
	 * Returns height of current object.
	 * 
	 * @return
	 */
	public int getHeight();
	
	
	/**
	 * Set width of Custom Graphics.
	 * 
	 * @param width
	 */
	public void setWidth(final int width);
	
	/**
	 * Set height of Custom Graphics.
	 * 
	 * @param height
	 */
	public void setHeight(final int height);
	
	public float getFitRatio();
	public void setFitRatio(float ratio);
	
	/**
	 * From layers of graphics objects, render scaled Image object.
	 * Usually done by Java2D low level code. 
	 * 
	 * Usually, the image returned by this method is used in GUI components (as icons).
	 * 
	 * @return rendered image object.
	 */
	public Image getRenderedImage();
}
