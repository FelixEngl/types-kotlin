// Automatically generated - do not modify!

@file:JsModule("cesium")

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
)

package cesium

/**
 * An imagery provider that provides tiled imagery as generated by
 * [MapTiler](http://www.maptiler.org/), [GDAL2Tiles](http://www.klokan.cz/projects/gdal2tiles/), etc.
 * ```
 * const tms = new TileMapServiceImageryProvider({
 *    url : '../images/cesium_maptiler/Cesium_Logo_Color',
 *    fileExtension: 'png',
 *    maximumLevel: 4,
 *    rectangle: new Rectangle(
 *        Math.toRadians(-120.0),
 *        Math.toRadians(20.0),
 *        Math.toRadians(-60.0),
 *        Math.toRadians(40.0))
 * });
 * ```
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/TileMapServiceImageryProvider.html">Online Documentation</a>
 */
external class TileMapServiceImageryProvider(options: ConstructorOptions) {
    /**
     * Initialization options for the TileMapServiceImageryProvider constructor
     * @property [url] Path to image tiles on server.
     *   Default value - `'.'`
     * @property [fileExtension] The file extension for images on the server.
     *   Default value - `'png'`
     * @property [credit] A credit for the data source, which is displayed on the canvas.
     *   Default value - `''`
     * @property [minimumLevel] The minimum level-of-detail supported by the imagery provider.  Take care when specifying
     *   this that the number of tiles at the minimum level is small, such as four or less.  A larger number is likely
     *   to result in rendering problems.
     *   Default value - `0`
     * @property [maximumLevel] The maximum level-of-detail supported by the imagery provider, or undefined if there is no limit.
     * @property [rectangle] The rectangle, in radians, covered by the image.
     *   Default value - [Rectangle.MAX_VALUE]
     * @property [tilingScheme] The tiling scheme specifying how the ellipsoidal
     *   surface is broken into tiles.  If this parameter is not provided, a [WebMercatorTilingScheme]
     *   is used.
     * @property [ellipsoid] The ellipsoid.  If the tilingScheme is specified,
     *   this parameter is ignored and the tiling scheme's ellipsoid is used instead. If neither
     *   parameter is specified, the WGS84 ellipsoid is used.
     * @property [tileWidth] Pixel width of image tiles.
     *   Default value - `256`
     * @property [tileHeight] Pixel height of image tiles.
     *   Default value - `256`
     * @property [flipXY] Older versions of gdal2tiles.py flipped X and Y values in tilemapresource.xml.
     *   Specifying this option will do the same, allowing for loading of these incorrect tilesets.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/TileMapServiceImageryProvider.html#.ConstructorOptions">Online Documentation</a>
     */
    interface ConstructorOptions {
        var url: dynamic
        var fileExtension: String?
        var credit: Credit?
        var minimumLevel: Int?
        var maximumLevel: Int?
        var rectangle: Rectangle?
        var tilingScheme: TilingScheme?
        var ellipsoid: Ellipsoid?
        var tileWidth: Int?
        var tileHeight: Int?
        var flipXY: Boolean?
    }
}

inline fun TileMapServiceImageryProvider(
    block: TileMapServiceImageryProvider.ConstructorOptions.() -> Unit,
): TileMapServiceImageryProvider {
    val options: TileMapServiceImageryProvider.ConstructorOptions = js("({})")
    block(options)
    return TileMapServiceImageryProvider(options)
}