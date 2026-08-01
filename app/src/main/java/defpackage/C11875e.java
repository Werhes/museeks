package defpackage;

import android.graphics.Matrix;
import android.graphics.Paint;
import java.util.ArrayList;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eِٞؒ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11875e extends AbstractC11583e {
    public final Matrix ad;
    public final Matrix adcel;
    public float appmetrica;
    public float billing;
    public float license;
    public float metrica;
    public String mopub;
    public float purchase;
    public float startapp;
    public final ArrayList vip;
    public float yandex;

    public C11875e() {
        this.ad = new Matrix();
        this.vip = new ArrayList();
        this.metrica = 0.0f;
        this.license = 0.0f;
        this.appmetrica = 0.0f;
        this.purchase = 1.0f;
        this.billing = 1.0f;
        this.yandex = 0.0f;
        this.startapp = 0.0f;
        this.adcel = new Matrix();
        this.mopub = null;
    }

    /* JADX WARN: Type inference failed for: r4v5, types: [eٌؚٛ, eٗۡۤ] */
    public C11875e(C11875e c11875e, C2271e c2271e) {
        AbstractC7279e abstractC7279e;
        this.ad = new Matrix();
        this.vip = new ArrayList();
        this.metrica = 0.0f;
        this.license = 0.0f;
        this.appmetrica = 0.0f;
        this.purchase = 1.0f;
        this.billing = 1.0f;
        this.yandex = 0.0f;
        this.startapp = 0.0f;
        Matrix matrix = new Matrix();
        this.adcel = matrix;
        this.mopub = null;
        this.metrica = c11875e.metrica;
        this.license = c11875e.license;
        this.appmetrica = c11875e.appmetrica;
        this.purchase = c11875e.purchase;
        this.billing = c11875e.billing;
        this.yandex = c11875e.yandex;
        this.startapp = c11875e.startapp;
        String str = c11875e.mopub;
        this.mopub = str;
        if (str != null) {
            c2271e.put(str, this);
        }
        matrix.set(c11875e.adcel);
        ArrayList arrayList = c11875e.vip;
        for (int i = 0; i < arrayList.size(); i++) {
            Object obj = arrayList.get(i);
            if (obj instanceof C11875e) {
                this.vip.add(new C11875e((C11875e) obj, c2271e));
            } else {
                if (obj instanceof C17334e) {
                    C17334e c17334e = (C17334e) obj;
                    ?? abstractC7279e2 = new AbstractC7279e(c17334e);
                    abstractC7279e2.appmetrica = 0.0f;
                    abstractC7279e2.billing = 1.0f;
                    abstractC7279e2.yandex = 1.0f;
                    abstractC7279e2.startapp = 0.0f;
                    abstractC7279e2.adcel = 1.0f;
                    abstractC7279e2.mopub = 0.0f;
                    abstractC7279e2.advert = Paint.Cap.BUTT;
                    abstractC7279e2.smaato = Paint.Join.MITER;
                    abstractC7279e2.amazon = 4.0f;
                    abstractC7279e2.license = c17334e.license;
                    abstractC7279e2.appmetrica = c17334e.appmetrica;
                    abstractC7279e2.billing = c17334e.billing;
                    abstractC7279e2.purchase = c17334e.purchase;
                    abstractC7279e2.metrica = c17334e.metrica;
                    abstractC7279e2.yandex = c17334e.yandex;
                    abstractC7279e2.startapp = c17334e.startapp;
                    abstractC7279e2.adcel = c17334e.adcel;
                    abstractC7279e2.mopub = c17334e.mopub;
                    abstractC7279e2.advert = c17334e.advert;
                    abstractC7279e2.smaato = c17334e.smaato;
                    abstractC7279e2.amazon = c17334e.amazon;
                    abstractC7279e = abstractC7279e2;
                } else {
                    if (!(obj instanceof C6822e)) {
                        throw new IllegalStateException("Unknown object in the tree!");
                    }
                    abstractC7279e = new AbstractC7279e((C6822e) obj);
                }
                this.vip.add(abstractC7279e);
                Object obj2 = abstractC7279e.vip;
                if (obj2 != null) {
                    c2271e.put(obj2, abstractC7279e);
                }
            }
        }
    }

    @Override // defpackage.AbstractC11583e
    public final boolean ad() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.vip;
            if (i >= arrayList.size()) {
                return false;
            }
            if (((AbstractC11583e) arrayList.get(i)).ad()) {
                return true;
            }
            i++;
        }
    }

    public String getGroupName() {
        return this.mopub;
    }

    public Matrix getLocalMatrix() {
        return this.adcel;
    }

    public float getPivotX() {
        return this.license;
    }

    public float getPivotY() {
        return this.appmetrica;
    }

    public float getRotation() {
        return this.metrica;
    }

    public float getScaleX() {
        return this.purchase;
    }

    public float getScaleY() {
        return this.billing;
    }

    public float getTranslateX() {
        return this.yandex;
    }

    public float getTranslateY() {
        return this.startapp;
    }

    public final void metrica() {
        Matrix matrix = this.adcel;
        matrix.reset();
        matrix.postTranslate(-this.license, -this.appmetrica);
        matrix.postScale(this.purchase, this.billing);
        matrix.postRotate(this.metrica, 0.0f, 0.0f);
        matrix.postTranslate(this.yandex + this.license, this.startapp + this.appmetrica);
    }

    public void setPivotX(float f) {
        if (f != this.license) {
            this.license = f;
            metrica();
        }
    }

    public void setPivotY(float f) {
        if (f != this.appmetrica) {
            this.appmetrica = f;
            metrica();
        }
    }

    public void setRotation(float f) {
        if (f != this.metrica) {
            this.metrica = f;
            metrica();
        }
    }

    public void setScaleX(float f) {
        if (f != this.purchase) {
            this.purchase = f;
            metrica();
        }
    }

    public void setScaleY(float f) {
        if (f != this.billing) {
            this.billing = f;
            metrica();
        }
    }

    public void setTranslateX(float f) {
        if (f != this.yandex) {
            this.yandex = f;
            metrica();
        }
    }

    public void setTranslateY(float f) {
        if (f != this.startapp) {
            this.startapp = f;
            metrica();
        }
    }

    @Override // defpackage.AbstractC11583e
    public final boolean vip(int[] iArr) {
        int i = 0;
        boolean z = false;
        while (true) {
            ArrayList arrayList = this.vip;
            if (i >= arrayList.size()) {
                return z;
            }
            z |= ((AbstractC11583e) arrayList.get(i)).vip(iArr);
            i++;
        }
    }
}
