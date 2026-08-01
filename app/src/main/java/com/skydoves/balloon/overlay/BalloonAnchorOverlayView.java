package com.skydoves.balloon.overlay;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.view.View;
import defpackage.AbstractC10257e;
import defpackage.AbstractC14753e;
import defpackage.AbstractC14905e;
import defpackage.AbstractC1619e;
import defpackage.AbstractC3820e;
import defpackage.C0032e;
import defpackage.C10833e;
import defpackage.C11883e;
import defpackage.C12232e;
import defpackage.C13506e;
import defpackage.C14803e;
import defpackage.C18130e;
import defpackage.C6571e;
import defpackage.InterfaceC8614e;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010 \n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\n\u0010\u000bR/\u0010\u0013\u001a\u0004\u0018\u00010\u00012\b\u0010\f\u001a\u0004\u0018\u00010\u00018F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R;\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00142\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00148F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0015\u0010\u000e\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R+\u0010\u001f\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u00068G@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u001b\u0010\u000e\u001a\u0004\b\u001c\u0010\u000b\"\u0004\b\u001d\u0010\u001eR+\u0010#\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u00068G@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b \u0010\u000e\u001a\u0004\b!\u0010\u000b\"\u0004\b\"\u0010\u001eR/\u0010*\u001a\u0004\u0018\u00010$2\b\u0010\f\u001a\u0004\u0018\u00010$8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b%\u0010\u000e\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R+\u00101\u001a\u00020+2\u0006\u0010\f\u001a\u00020+8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b,\u0010\u000e\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R/\u00108\u001a\u0004\u0018\u0001022\b\u0010\f\u001a\u0004\u0018\u0001028F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b3\u0010\u000e\u001a\u0004\b4\u00105\"\u0004\b6\u00107R+\u0010?\u001a\u0002092\u0006\u0010\f\u001a\u0002098F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b:\u0010\u000e\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>¨\u0006@"}, d2 = {"Lcom/skydoves/balloon/overlay/BalloonAnchorOverlayView;", "Landroid/view/View;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attr", BuildConfig.FLAVOR, "defStyle", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "getStatusBarHeight", "()I", "<set-?>", "eّٖۦ", "Leَِٞ;", "getAnchorView", "()Landroid/view/View;", "setAnchorView", "(Landroid/view/View;)V", "anchorView", BuildConfig.FLAVOR, "eؘٙؓ", "getAnchorViewList", "()Ljava/util/List;", "setAnchorViewList", "(Ljava/util/List;)V", "anchorViewList", "eًؔؐ", "getOverlayColor", "setOverlayColor", "(I)V", "overlayColor", "eؙِٖ", "getOverlayPaddingColor", "setOverlayPaddingColor", "overlayPaddingColor", "Landroid/graphics/Shader;", "eّؑؑ", "getOverlayPaddingShader", "()Landroid/graphics/Shader;", "setOverlayPaddingShader", "(Landroid/graphics/Shader;)V", "overlayPaddingShader", "Leُؑؒ;", "eٗۚۖ", "getOverlayPadding", "()Leُؑؒ;", "setOverlayPadding", "(Leُؑؒ;)V", "overlayPadding", "Landroid/graphics/Point;", "eؘَٗ", "getOverlayPosition", "()Landroid/graphics/Point;", "setOverlayPosition", "(Landroid/graphics/Point;)V", "overlayPosition", "Leٔۗؔ;", "eٌٍٚ", "getBalloonOverlayShape", "()Leٔۗؔ;", "setBalloonOverlayShape", "(Leٔۗؔ;)V", "balloonOverlayShape", "balloon_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class BalloonAnchorOverlayView extends View {

    /* renamed from: eٕؒۙ, reason: contains not printable characters */
    public static final /* synthetic */ InterfaceC8614e[] f1083e;

    /* renamed from: eّؑؑ, reason: contains not printable characters and from kotlin metadata */
    public final C11883e overlayPaddingShader;

    /* renamed from: eٕؓۥ, reason: contains not printable characters */
    public boolean f1085e;

    /* renamed from: eًؔؐ, reason: contains not printable characters and from kotlin metadata */
    public final C11883e overlayColor;

    /* renamed from: eؙؔٞ, reason: contains not printable characters */
    public final Paint f1087e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters and from kotlin metadata */
    public final C11883e anchorViewList;

    /* renamed from: eٌٍٚ, reason: contains not printable characters and from kotlin metadata */
    public final C11883e balloonOverlayShape;

    /* renamed from: eٍۗۛ, reason: contains not printable characters */
    public final Paint f1090e;

    /* renamed from: eؙِٖ, reason: contains not printable characters and from kotlin metadata */
    public final C11883e overlayPaddingColor;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public Bitmap f1092e;

    /* renamed from: eّٖۦ, reason: contains not printable characters and from kotlin metadata */
    public final C11883e anchorView;

    /* renamed from: eؘَٗ, reason: contains not printable characters and from kotlin metadata */
    public final C11883e overlayPosition;

    /* renamed from: eٗۚۖ, reason: contains not printable characters and from kotlin metadata */
    public final C11883e overlayPadding;

    static {
        C13506e c13506e = new C13506e(BalloonAnchorOverlayView.class, "anchorView", "getAnchorView()Landroid/view/View;", 0);
        C12232e c12232e = AbstractC3820e.ad;
        f1083e = new InterfaceC8614e[]{c12232e.purchase(c13506e), AbstractC10257e.billing(BalloonAnchorOverlayView.class, "anchorViewList", "getAnchorViewList()Ljava/util/List;", 0, c12232e), AbstractC10257e.billing(BalloonAnchorOverlayView.class, "overlayColor", "getOverlayColor()I", 0, c12232e), AbstractC10257e.billing(BalloonAnchorOverlayView.class, "overlayPaddingColor", "getOverlayPaddingColor()I", 0, c12232e), AbstractC10257e.billing(BalloonAnchorOverlayView.class, "overlayPaddingShader", "getOverlayPaddingShader()Landroid/graphics/Shader;", 0, c12232e), AbstractC10257e.billing(BalloonAnchorOverlayView.class, "overlayPadding", "getOverlayPadding()Lcom/skydoves/balloon/BalloonOverlayPadding;", 0, c12232e), AbstractC10257e.billing(BalloonAnchorOverlayView.class, "overlayPosition", "getOverlayPosition()Landroid/graphics/Point;", 0, c12232e), AbstractC10257e.billing(BalloonAnchorOverlayView.class, "balloonOverlayShape", "getBalloonOverlayShape()Lcom/skydoves/balloon/overlay/BalloonOverlayShape;", 0, c12232e)};
    }

    public BalloonAnchorOverlayView(Context context) {
        this(context, null, 0, 6, null);
    }

    public BalloonAnchorOverlayView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public BalloonAnchorOverlayView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.anchorView = AbstractC14753e.appmetrica(this, null);
        this.anchorViewList = AbstractC14753e.appmetrica(this, null);
        this.overlayColor = AbstractC14753e.appmetrica(this, 0);
        this.overlayPaddingColor = AbstractC14753e.appmetrica(this, 0);
        this.overlayPaddingShader = AbstractC14753e.appmetrica(this, null);
        this.overlayPadding = AbstractC14753e.appmetrica(this, new C0032e());
        this.overlayPosition = AbstractC14753e.appmetrica(this, null);
        this.balloonOverlayShape = AbstractC14753e.appmetrica(this, C10833e.ad);
        Paint paint = new Paint(1);
        this.f1087e = paint;
        Paint paint2 = new Paint(1);
        this.f1090e = paint2;
        paint.setAntiAlias(true);
        paint.setFilterBitmap(true);
        paint.setDither(true);
        paint2.setAntiAlias(true);
        paint2.setFilterBitmap(true);
        paint2.setDither(true);
    }

    public /* synthetic */ BalloonAnchorOverlayView(Context context, AttributeSet attributeSet, int i, int i2, AbstractC1619e abstractC1619e) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    private final int getStatusBarHeight() {
        Rect rect = new Rect();
        Context context = getContext();
        if (!(context instanceof Activity)) {
            return 0;
        }
        ((Activity) context).getWindow().getDecorView().getWindowVisibleDisplayFrame(rect);
        return rect.top;
    }

    public final void ad(View view, Canvas canvas) {
        RectF rectF;
        if (view != null) {
            Rect rect = new Rect();
            view.getGlobalVisibleRect(rect);
            rect.offset((int) view.getTranslationX(), (int) view.getTranslationY());
            if (getOverlayPosition() != null) {
                rectF = new RectF(r1.x - getOverlayPadding().ad, (r1.y - getOverlayPadding().vip) + getStatusBarHeight(), view.getWidth() + r1.x + getOverlayPadding().metrica, view.getHeight() + r1.y + getOverlayPadding().license + getStatusBarHeight());
            } else {
                rectF = new RectF(rect.left - getOverlayPadding().ad, rect.top - getOverlayPadding().vip, rect.right + getOverlayPadding().metrica, rect.bottom + getOverlayPadding().license);
            }
            float f = 2;
            float f2 = getOverlayPadding().vip / f;
            float f3 = getOverlayPadding().license;
            float f4 = getOverlayPadding().ad / f;
            float f5 = getOverlayPadding().metrica;
            RectF rectF2 = new RectF(rectF);
            rectF2.inset(f4, f2);
            AbstractC14905e balloonOverlayShape = getBalloonOverlayShape();
            boolean z = balloonOverlayShape instanceof C10833e;
            Paint paint = this.f1090e;
            Paint paint2 = this.f1087e;
            if (z) {
                canvas.drawOval(rectF, paint2);
                canvas.drawOval(rectF2, paint);
            } else {
                if (!(balloonOverlayShape instanceof C18130e)) {
                    throw new C14803e(10);
                }
                C6571e c6571e = ((C18130e) balloonOverlayShape).ad;
                Object obj = c6571e.f13543e;
                Number number = (Number) c6571e.f13544e;
                Number number2 = (Number) obj;
                canvas.drawRoundRect(rectF, number.floatValue(), number2.floatValue(), paint2);
                canvas.drawRoundRect(rectF2, number.floatValue() - (getOverlayPadding().ad / f), number2.floatValue() - (getOverlayPadding().vip / f), paint);
            }
        }
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        View anchorView;
        View anchorView2;
        Bitmap bitmap;
        if ((this.f1085e || (bitmap = this.f1092e) == null || bitmap.isRecycled()) && getWidth() != 0 && getHeight() != 0 && (((anchorView = getAnchorView()) == null || anchorView.getWidth() != 0) && ((anchorView2 = getAnchorView()) == null || anchorView2.getHeight() != 0))) {
            Bitmap bitmap2 = this.f1092e;
            if (bitmap2 != null && !bitmap2.isRecycled()) {
                bitmap2.recycle();
            }
            Bitmap createBitmap = Bitmap.createBitmap(getWidth(), getHeight(), Bitmap.Config.ARGB_8888);
            this.f1092e = createBitmap;
            Canvas canvas2 = new Canvas(createBitmap);
            PorterDuffXfermode porterDuffXfermode = new PorterDuffXfermode(PorterDuff.Mode.SRC_OUT);
            Paint paint = this.f1087e;
            paint.setXfermode(porterDuffXfermode);
            paint.setColor(getOverlayColor());
            canvas2.drawRect(0.0f, 0.0f, getWidth(), getHeight(), paint);
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
            paint.setColor(0);
            int overlayPaddingColor = getOverlayPaddingColor();
            Paint paint2 = this.f1090e;
            paint2.setColor(overlayPaddingColor);
            paint2.setStyle(Paint.Style.STROKE);
            paint2.setStrokeWidth(getOverlayPadding().vip);
            paint2.setShader(getOverlayPaddingShader());
            List<View> anchorViewList = getAnchorViewList();
            if (anchorViewList == null || anchorViewList.isEmpty()) {
                ad(getAnchorView(), canvas2);
            } else {
                List<View> anchorViewList2 = getAnchorViewList();
                if (anchorViewList2 != null) {
                    Iterator<T> it = anchorViewList2.iterator();
                    while (it.hasNext()) {
                        ad((View) it.next(), canvas2);
                    }
                }
            }
            this.f1085e = false;
        }
        Bitmap bitmap3 = this.f1092e;
        if (bitmap3 == null || bitmap3.isRecycled()) {
            return;
        }
        canvas.drawBitmap(bitmap3, 0.0f, 0.0f, (Paint) null);
    }

    public final View getAnchorView() {
        InterfaceC8614e interfaceC8614e = f1083e[0];
        return (View) this.anchorView.f23814e;
    }

    public final List<View> getAnchorViewList() {
        InterfaceC8614e interfaceC8614e = f1083e[1];
        return (List) this.anchorViewList.f23814e;
    }

    public final AbstractC14905e getBalloonOverlayShape() {
        InterfaceC8614e interfaceC8614e = f1083e[7];
        return (AbstractC14905e) this.balloonOverlayShape.f23814e;
    }

    public final int getOverlayColor() {
        InterfaceC8614e interfaceC8614e = f1083e[2];
        return ((Number) this.overlayColor.f23814e).intValue();
    }

    public final C0032e getOverlayPadding() {
        InterfaceC8614e interfaceC8614e = f1083e[5];
        return (C0032e) this.overlayPadding.f23814e;
    }

    public final int getOverlayPaddingColor() {
        InterfaceC8614e interfaceC8614e = f1083e[3];
        return ((Number) this.overlayPaddingColor.f23814e).intValue();
    }

    public final Shader getOverlayPaddingShader() {
        InterfaceC8614e interfaceC8614e = f1083e[4];
        return (Shader) this.overlayPaddingShader.f23814e;
    }

    public final Point getOverlayPosition() {
        InterfaceC8614e interfaceC8614e = f1083e[6];
        return (Point) this.overlayPosition.f23814e;
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.f1085e = true;
    }

    public final void setAnchorView(View view) {
        this.anchorView.remoteconfig(f1083e[0], view);
    }

    public final void setAnchorViewList(List<? extends View> list) {
        this.anchorViewList.remoteconfig(f1083e[1], list);
    }

    public final void setBalloonOverlayShape(AbstractC14905e abstractC14905e) {
        this.balloonOverlayShape.remoteconfig(f1083e[7], abstractC14905e);
    }

    public final void setOverlayColor(int i) {
        this.overlayColor.remoteconfig(f1083e[2], Integer.valueOf(i));
    }

    public final void setOverlayPadding(C0032e c0032e) {
        this.overlayPadding.remoteconfig(f1083e[5], c0032e);
    }

    public final void setOverlayPaddingColor(int i) {
        this.overlayPaddingColor.remoteconfig(f1083e[3], Integer.valueOf(i));
    }

    public final void setOverlayPaddingShader(Shader shader) {
        this.overlayPaddingShader.remoteconfig(f1083e[4], shader);
    }

    public final void setOverlayPosition(Point point) {
        this.overlayPosition.remoteconfig(f1083e[6], point);
    }
}
