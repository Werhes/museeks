package defpackage;

import android.graphics.Matrix;
import android.graphics.Path;
import java.util.ArrayList;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٖؗ۟, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C16022e {
    public float ad;
    public float appmetrica;
    public float license;
    public float metrica;
    public float vip;
    public final ArrayList purchase = new ArrayList();
    public final ArrayList billing = new ArrayList();

    public C16022e() {
        license(0.0f, 270.0f, 0.0f);
    }

    public final void ad(float f) {
        float f2 = this.license;
        if (f2 == f) {
            return;
        }
        float f3 = ((f - f2) + 360.0f) % 360.0f;
        if (f3 > 180.0f) {
            return;
        }
        float f4 = this.vip;
        float f5 = this.metrica;
        C0249e c0249e = new C0249e(f4, f5, f4, f5);
        c0249e.purchase = this.license;
        c0249e.billing = f3;
        this.billing.add(new C13508e(c0249e));
        this.license = f;
    }

    public final void license(float f, float f2, float f3) {
        this.ad = f;
        this.vip = 0.0f;
        this.metrica = f;
        this.license = f2;
        this.appmetrica = (f2 + f3) % 360.0f;
        this.purchase.clear();
        this.billing.clear();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [eًۖۗ, eؘؗۖ, java.lang.Object] */
    public final void metrica(float f, float f2) {
        ?? abstractC8135e = new AbstractC8135e();
        abstractC8135e.vip = f;
        abstractC8135e.metrica = f2;
        this.purchase.add(abstractC8135e);
        C14837e c14837e = new C14837e(abstractC8135e, this.vip, this.metrica);
        float vip = c14837e.vip() + 270.0f;
        float vip2 = c14837e.vip() + 270.0f;
        ad(vip);
        this.billing.add(c14837e);
        this.license = vip2;
        this.vip = f;
        this.metrica = f2;
    }

    public final void vip(Matrix matrix, Path path) {
        ArrayList arrayList = this.purchase;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((AbstractC8135e) arrayList.get(i)).ad(matrix, path);
        }
    }
}
