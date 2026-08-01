package defpackage;

import android.graphics.Bitmap;
import android.graphics.BlendMode;
import android.graphics.Canvas;
import android.graphics.DrawFilter;
import android.graphics.Matrix;
import android.graphics.NinePatch;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Picture;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.RenderNode;
import android.graphics.fonts.Font;
import android.graphics.text.MeasuredText;
import androidx.car.app.model.Alert;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؚۥۤ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7598e extends Canvas {
    public Canvas ad;

    public final Canvas ad() {
        Canvas canvas = this.ad;
        if (canvas != null) {
            return canvas;
        }
        AbstractC5525e.metrica("Text drawing wrapper is missing a Canvas!");
        throw new C14803e(9);
    }

    @Override // android.graphics.Canvas
    public final boolean clipOutPath(Path path) {
        return AbstractC11815e.license(ad(), path);
    }

    @Override // android.graphics.Canvas
    public final boolean clipOutRect(float f, float f2, float f3, float f4) {
        return AbstractC11815e.appmetrica(ad(), f, f2, f3, f4);
    }

    @Override // android.graphics.Canvas
    public final boolean clipOutRect(int i, int i2, int i3, int i4) {
        return AbstractC11815e.purchase(ad(), i, i2, i3, i4);
    }

    @Override // android.graphics.Canvas
    public final boolean clipOutRect(Rect rect) {
        return AbstractC11815e.billing(ad(), rect);
    }

    @Override // android.graphics.Canvas
    public final boolean clipOutRect(RectF rectF) {
        return AbstractC11815e.yandex(ad(), rectF);
    }

    @Override // android.graphics.Canvas
    public final boolean clipPath(Path path) {
        return ad().clipPath(path);
    }

    @Override // android.graphics.Canvas
    public final boolean clipPath(Path path, Region.Op op) {
        return ad().clipPath(path, op);
    }

    @Override // android.graphics.Canvas
    public final boolean clipRect(float f, float f2, float f3, float f4) {
        return ad().clipRect(f, f2, f3, f4);
    }

    @Override // android.graphics.Canvas
    public final boolean clipRect(float f, float f2, float f3, float f4, Region.Op op) {
        return ad().clipRect(f, f2, f3, f4, op);
    }

    @Override // android.graphics.Canvas
    public final boolean clipRect(int i, int i2, int i3, int i4) {
        return ad().clipRect(i, i2, i3, i4);
    }

    @Override // android.graphics.Canvas
    public final boolean clipRect(Rect rect) {
        return ad().clipRect(rect);
    }

    @Override // android.graphics.Canvas
    public final boolean clipRect(Rect rect, Region.Op op) {
        return ad().clipRect(rect, op);
    }

    @Override // android.graphics.Canvas
    public final boolean clipRect(RectF rectF) {
        return ad().clipRect(rectF);
    }

    @Override // android.graphics.Canvas
    public final boolean clipRect(RectF rectF, Region.Op op) {
        return ad().clipRect(rectF, op);
    }

    @Override // android.graphics.Canvas
    public final void concat(Matrix matrix) {
        ad().concat(matrix);
    }

    @Override // android.graphics.Canvas
    public final void disableZ() {
        AbstractC14204e.appmetrica(ad());
    }

    @Override // android.graphics.Canvas
    public final void drawARGB(int i, int i2, int i3, int i4) {
        ad().drawARGB(i, i2, i3, i4);
    }

    @Override // android.graphics.Canvas
    public final void drawArc(float f, float f2, float f3, float f4, float f5, float f6, boolean z, Paint paint) {
        ad().drawArc(f, f2, f3, f4, f5, f6, z, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawArc(RectF rectF, float f, float f2, boolean z, Paint paint) {
        ad().drawArc(rectF, f, f2, z, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawBitmap(Bitmap bitmap, float f, float f2, Paint paint) {
        ad().drawBitmap(bitmap, f, f2, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawBitmap(Bitmap bitmap, Matrix matrix, Paint paint) {
        ad().drawBitmap(bitmap, matrix, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawBitmap(Bitmap bitmap, Rect rect, Rect rect2, Paint paint) {
        ad().drawBitmap(bitmap, rect, rect2, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawBitmap(Bitmap bitmap, Rect rect, RectF rectF, Paint paint) {
        ad().drawBitmap(bitmap, rect, rectF, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawBitmap(int[] iArr, int i, int i2, float f, float f2, int i3, int i4, boolean z, Paint paint) {
        ad().drawBitmap(iArr, i, i2, f, f2, i3, i4, z, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawBitmap(int[] iArr, int i, int i2, int i3, int i4, int i5, int i6, boolean z, Paint paint) {
        ad().drawBitmap(iArr, i, i2, i3, i4, i5, i6, z, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawBitmapMesh(Bitmap bitmap, int i, int i2, float[] fArr, int i3, int[] iArr, int i4, Paint paint) {
        ad().drawBitmapMesh(bitmap, i, i2, fArr, i3, iArr, i4, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawCircle(float f, float f2, float f3, Paint paint) {
        ad().drawCircle(f, f2, f3, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawColor(int i) {
        ad().drawColor(i);
    }

    @Override // android.graphics.Canvas
    public final void drawColor(int i, BlendMode blendMode) {
        AbstractC14204e.purchase(ad(), i, blendMode);
    }

    @Override // android.graphics.Canvas
    public final void drawColor(int i, PorterDuff.Mode mode) {
        ad().drawColor(i, mode);
    }

    @Override // android.graphics.Canvas
    public final void drawColor(long j) {
        AbstractC14204e.billing(ad(), j);
    }

    @Override // android.graphics.Canvas
    public final void drawColor(long j, BlendMode blendMode) {
        AbstractC14204e.yandex(ad(), j, blendMode);
    }

    @Override // android.graphics.Canvas
    public final void drawDoubleRoundRect(RectF rectF, float f, float f2, RectF rectF2, float f3, float f4, Paint paint) {
        AbstractC14204e.startapp(ad(), rectF, f, f2, rectF2, f3, f4, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawDoubleRoundRect(RectF rectF, float[] fArr, RectF rectF2, float[] fArr2, Paint paint) {
        AbstractC14204e.adcel(ad(), rectF, fArr, rectF2, fArr2, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawGlyphs(int[] iArr, int i, float[] fArr, int i2, int i3, Font font, Paint paint) {
        AbstractC16048e.billing(ad(), iArr, i, fArr, i2, i3, font, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawLine(float f, float f2, float f3, float f4, Paint paint) {
        ad().drawLine(f, f2, f3, f4, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawLines(float[] fArr, int i, int i2, Paint paint) {
        ad().drawLines(fArr, i, i2, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawLines(float[] fArr, Paint paint) {
        ad().drawLines(fArr, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawOval(float f, float f2, float f3, float f4, Paint paint) {
        ad().drawOval(f, f2, f3, f4, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawOval(RectF rectF, Paint paint) {
        ad().drawOval(rectF, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawPaint(Paint paint) {
        ad().drawPaint(paint);
    }

    @Override // android.graphics.Canvas
    public final void drawPatch(NinePatch ninePatch, Rect rect, Paint paint) {
        AbstractC16048e.yandex(ad(), ninePatch, rect, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawPatch(NinePatch ninePatch, RectF rectF, Paint paint) {
        AbstractC16048e.startapp(ad(), ninePatch, rectF, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawPath(Path path, Paint paint) {
        ad().drawPath(path, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawPicture(Picture picture) {
        ad().drawPicture(picture);
    }

    @Override // android.graphics.Canvas
    public final void drawPicture(Picture picture, Rect rect) {
        ad().drawPicture(picture, rect);
    }

    @Override // android.graphics.Canvas
    public final void drawPicture(Picture picture, RectF rectF) {
        ad().drawPicture(picture, rectF);
    }

    @Override // android.graphics.Canvas
    public final void drawPoint(float f, float f2, Paint paint) {
        ad().drawPoint(f, f2, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawPoints(float[] fArr, int i, int i2, Paint paint) {
        ad().drawPoints(fArr, i, i2, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawPoints(float[] fArr, Paint paint) {
        ad().drawPoints(fArr, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawPosText(String str, float[] fArr, Paint paint) {
        ad().drawPosText(str, fArr, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawPosText(char[] cArr, int i, int i2, float[] fArr, Paint paint) {
        ad().drawPosText(cArr, i, i2, fArr, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawRGB(int i, int i2, int i3) {
        ad().drawRGB(i, i2, i3);
    }

    @Override // android.graphics.Canvas
    public final void drawRect(float f, float f2, float f3, float f4, Paint paint) {
        ad().drawRect(f, f2, f3, f4, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawRect(Rect rect, Paint paint) {
        ad().drawRect(rect, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawRect(RectF rectF, Paint paint) {
        ad().drawRect(rectF, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawRenderNode(RenderNode renderNode) {
        AbstractC14204e.mopub(ad(), renderNode);
    }

    @Override // android.graphics.Canvas
    public final void drawRoundRect(float f, float f2, float f3, float f4, float f5, float f6, Paint paint) {
        ad().drawRoundRect(f, f2, f3, f4, f5, f6, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawRoundRect(RectF rectF, float f, float f2, Paint paint) {
        ad().drawRoundRect(rectF, f, f2, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawText(CharSequence charSequence, int i, int i2, float f, float f2, Paint paint) {
        ad().drawText(charSequence, i, i2, f, f2, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawText(String str, float f, float f2, Paint paint) {
        ad().drawText(str, f, f2, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawText(String str, int i, int i2, float f, float f2, Paint paint) {
        ad().drawText(str, i, i2, f, f2, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawText(char[] cArr, int i, int i2, float f, float f2, Paint paint) {
        ad().drawText(cArr, i, i2, f, f2, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawTextOnPath(String str, Path path, float f, float f2, Paint paint) {
        ad().drawTextOnPath(str, path, f, f2, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawTextOnPath(char[] cArr, int i, int i2, Path path, float f, float f2, Paint paint) {
        ad().drawTextOnPath(cArr, i, i2, path, f, f2, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawTextRun(MeasuredText measuredText, int i, int i2, int i3, int i4, float f, float f2, boolean z, Paint paint) {
        AbstractC14204e.advert(ad(), measuredText, i, i2, i3, i4, f, f2, z, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawTextRun(CharSequence charSequence, int i, int i2, int i3, int i4, float f, float f2, boolean z, Paint paint) {
        ad().drawTextRun(charSequence, i, i2, i3, i4, f, f2, z, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawTextRun(char[] cArr, int i, int i2, int i3, int i4, float f, float f2, boolean z, Paint paint) {
        ad().drawTextRun(cArr, i, i2, i3, i4, f, f2, z, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawVertices(Canvas.VertexMode vertexMode, int i, float[] fArr, int i2, float[] fArr2, int i3, int[] iArr, int i4, short[] sArr, int i5, int i6, Paint paint) {
        ad().drawVertices(vertexMode, i, fArr, i2, fArr2, i3, iArr, i4, sArr, i5, i6, paint);
    }

    @Override // android.graphics.Canvas
    public final void enableZ() {
        AbstractC14204e.smaato(ad());
    }

    @Override // android.graphics.Canvas
    public final boolean getClipBounds(Rect rect) {
        boolean clipBounds = ad().getClipBounds(rect);
        if (clipBounds) {
            rect.set(0, 0, rect.width(), Alert.DURATION_SHOW_INDEFINITELY);
        }
        return clipBounds;
    }

    @Override // android.graphics.Canvas
    public final int getDensity() {
        return ad().getDensity();
    }

    @Override // android.graphics.Canvas
    public final DrawFilter getDrawFilter() {
        return ad().getDrawFilter();
    }

    @Override // android.graphics.Canvas
    public final int getHeight() {
        return ad().getHeight();
    }

    @Override // android.graphics.Canvas
    public final void getMatrix(Matrix matrix) {
        ad().getMatrix(matrix);
    }

    @Override // android.graphics.Canvas
    public final int getMaximumBitmapHeight() {
        return ad().getMaximumBitmapHeight();
    }

    @Override // android.graphics.Canvas
    public final int getMaximumBitmapWidth() {
        return ad().getMaximumBitmapWidth();
    }

    @Override // android.graphics.Canvas
    public final int getSaveCount() {
        return ad().getSaveCount();
    }

    @Override // android.graphics.Canvas
    public final int getWidth() {
        return ad().getWidth();
    }

    @Override // android.graphics.Canvas
    public final boolean isOpaque() {
        return ad().isOpaque();
    }

    @Override // android.graphics.Canvas
    public final boolean quickReject(float f, float f2, float f3, float f4) {
        return AbstractC5096e.smaato(ad(), f, f2, f3, f4);
    }

    @Override // android.graphics.Canvas
    public final boolean quickReject(float f, float f2, float f3, float f4, Canvas.EdgeType edgeType) {
        return ad().quickReject(f, f2, f3, f4, edgeType);
    }

    @Override // android.graphics.Canvas
    public final boolean quickReject(Path path) {
        return AbstractC5096e.amazon(ad(), path);
    }

    @Override // android.graphics.Canvas
    public final boolean quickReject(Path path, Canvas.EdgeType edgeType) {
        return ad().quickReject(path, edgeType);
    }

    @Override // android.graphics.Canvas
    public final boolean quickReject(RectF rectF) {
        return AbstractC5096e.loadAd(ad(), rectF);
    }

    @Override // android.graphics.Canvas
    public final boolean quickReject(RectF rectF, Canvas.EdgeType edgeType) {
        return ad().quickReject(rectF, edgeType);
    }

    @Override // android.graphics.Canvas
    public final void restore() {
        ad().restore();
    }

    @Override // android.graphics.Canvas
    public final void restoreToCount(int i) {
        ad().restoreToCount(i);
    }

    @Override // android.graphics.Canvas
    public final void rotate(float f) {
        ad().rotate(f);
    }

    @Override // android.graphics.Canvas
    public final int save() {
        return ad().save();
    }

    @Override // android.graphics.Canvas
    public final int saveLayer(float f, float f2, float f3, float f4, Paint paint) {
        return ad().saveLayer(f, f2, f3, f4, paint);
    }

    @Override // android.graphics.Canvas
    public final int saveLayer(float f, float f2, float f3, float f4, Paint paint, int i) {
        return ad().saveLayer(f, f2, f3, f4, paint, i);
    }

    @Override // android.graphics.Canvas
    public final int saveLayer(RectF rectF, Paint paint) {
        return ad().saveLayer(rectF, paint);
    }

    @Override // android.graphics.Canvas
    public final int saveLayer(RectF rectF, Paint paint, int i) {
        return ad().saveLayer(rectF, paint, i);
    }

    @Override // android.graphics.Canvas
    public final int saveLayerAlpha(float f, float f2, float f3, float f4, int i) {
        return ad().saveLayerAlpha(f, f2, f3, f4, i);
    }

    @Override // android.graphics.Canvas
    public final int saveLayerAlpha(float f, float f2, float f3, float f4, int i, int i2) {
        return ad().saveLayerAlpha(f, f2, f3, f4, i, i2);
    }

    @Override // android.graphics.Canvas
    public final int saveLayerAlpha(RectF rectF, int i) {
        return ad().saveLayerAlpha(rectF, i);
    }

    @Override // android.graphics.Canvas
    public final int saveLayerAlpha(RectF rectF, int i, int i2) {
        return ad().saveLayerAlpha(rectF, i, i2);
    }

    @Override // android.graphics.Canvas
    public final void scale(float f, float f2) {
        ad().scale(f, f2);
    }

    @Override // android.graphics.Canvas
    public final void setBitmap(Bitmap bitmap) {
        ad().setBitmap(bitmap);
    }

    @Override // android.graphics.Canvas
    public final void setDensity(int i) {
        ad().setDensity(i);
    }

    @Override // android.graphics.Canvas
    public final void setDrawFilter(DrawFilter drawFilter) {
        ad().setDrawFilter(drawFilter);
    }

    @Override // android.graphics.Canvas
    public final void setMatrix(Matrix matrix) {
        ad().setMatrix(matrix);
    }

    @Override // android.graphics.Canvas
    public final void skew(float f, float f2) {
        ad().skew(f, f2);
    }

    @Override // android.graphics.Canvas
    public final void translate(float f, float f2) {
        ad().translate(f, f2);
    }
}
