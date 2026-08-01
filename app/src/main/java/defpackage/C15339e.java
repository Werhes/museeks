package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌِٕ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C15339e {
    public static final C7929e smaato = new C7929e(0.5f);
    public C1400e adcel;
    public C1400e advert;
    public C1400e mopub;
    public C1400e startapp;
    public AbstractC0421e ad = new Object();
    public AbstractC0421e vip = new Object();
    public AbstractC0421e metrica = new Object();
    public AbstractC0421e license = new Object();
    public InterfaceC16189e appmetrica = new C0685e(0.0f);
    public InterfaceC16189e purchase = new C0685e(0.0f);
    public InterfaceC16189e billing = new C0685e(0.0f);
    public InterfaceC16189e yandex = new C0685e(0.0f);

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, eًٜؑ] */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, eًٜؑ] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, eًٜؑ] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, eًٜؑ] */
    public C15339e() {
        int i = 0;
        this.startapp = new C1400e(i);
        this.adcel = new C1400e(i);
        this.mopub = new C1400e(i);
        this.advert = new C1400e(i);
    }

    public static C4568e ad(Context context, int i, int i2, InterfaceC16189e interfaceC16189e) {
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, i);
        if (i2 != 0) {
            contextThemeWrapper = new ContextThemeWrapper(contextThemeWrapper, i2);
        }
        TypedArray obtainStyledAttributes = contextThemeWrapper.obtainStyledAttributes(AbstractC11408e.firebase);
        try {
            int i3 = obtainStyledAttributes.getInt(0, 0);
            int i4 = obtainStyledAttributes.getInt(3, i3);
            int i5 = obtainStyledAttributes.getInt(4, i3);
            int i6 = obtainStyledAttributes.getInt(2, i3);
            int i7 = obtainStyledAttributes.getInt(1, i3);
            InterfaceC16189e metrica = metrica(obtainStyledAttributes, 5, interfaceC16189e);
            InterfaceC16189e metrica2 = metrica(obtainStyledAttributes, 8, metrica);
            InterfaceC16189e metrica3 = metrica(obtainStyledAttributes, 9, metrica);
            InterfaceC16189e metrica4 = metrica(obtainStyledAttributes, 7, metrica);
            InterfaceC16189e metrica5 = metrica(obtainStyledAttributes, 6, metrica);
            C4568e c4568e = new C4568e();
            c4568e.ad = AbstractC7754e.metrica(i4);
            c4568e.appmetrica = metrica2;
            c4568e.vip = AbstractC7754e.metrica(i5);
            c4568e.purchase = metrica3;
            c4568e.metrica = AbstractC7754e.metrica(i6);
            c4568e.billing = metrica4;
            c4568e.license = AbstractC7754e.metrica(i7);
            c4568e.yandex = metrica5;
            return c4568e;
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public static InterfaceC16189e metrica(TypedArray typedArray, int i, InterfaceC16189e interfaceC16189e) {
        TypedValue peekValue = typedArray.peekValue(i);
        if (peekValue != null) {
            int i2 = peekValue.type;
            if (i2 == 5) {
                return new C0685e(TypedValue.complexToDimensionPixelSize(peekValue.data, typedArray.getResources().getDisplayMetrics()));
            }
            if (i2 == 6) {
                return new C7929e(peekValue.getFraction(1.0f, 1.0f));
            }
        }
        return interfaceC16189e;
    }

    public static C4568e vip(Context context, AttributeSet attributeSet, int i, int i2) {
        C0685e c0685e = new C0685e(0);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC11408e.isPro, i, i2);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        int resourceId2 = obtainStyledAttributes.getResourceId(1, 0);
        obtainStyledAttributes.recycle();
        return ad(context, resourceId, resourceId2, c0685e);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, eؚؗؑ] */
    public final C4568e appmetrica() {
        ?? obj = new Object();
        obj.ad = this.ad;
        obj.vip = this.vip;
        obj.metrica = this.metrica;
        obj.license = this.license;
        obj.appmetrica = this.appmetrica;
        obj.purchase = this.purchase;
        obj.billing = this.billing;
        obj.yandex = this.yandex;
        obj.startapp = this.startapp;
        obj.adcel = this.adcel;
        obj.mopub = this.mopub;
        obj.advert = this.advert;
        return obj;
    }

    public final boolean license(RectF rectF) {
        boolean z = this.advert.getClass().equals(C1400e.class) && this.adcel.getClass().equals(C1400e.class) && this.startapp.getClass().equals(C1400e.class) && this.mopub.getClass().equals(C1400e.class);
        float ad = this.appmetrica.ad(rectF);
        return z && ((this.purchase.ad(rectF) > ad ? 1 : (this.purchase.ad(rectF) == ad ? 0 : -1)) == 0 && (this.yandex.ad(rectF) > ad ? 1 : (this.yandex.ad(rectF) == ad ? 0 : -1)) == 0 && (this.billing.ad(rectF) > ad ? 1 : (this.billing.ad(rectF) == ad ? 0 : -1)) == 0) && ((this.vip instanceof C0575e) && (this.ad instanceof C0575e) && (this.metrica instanceof C0575e) && (this.license instanceof C0575e));
    }
}
