package defpackage;

import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘُٓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5624e {
    public Object ad;
    public final /* synthetic */ C14995e license;
    public float metrica = Float.NaN;
    public Object vip;

    public C5624e(C14995e c14995e) {
        this.license = c14995e;
    }

    public final void ad(float f, float f2) {
        C14995e c14995e = this.license;
        C2616e c2616e = (C2616e) c14995e.startapp;
        float purchase = c2616e.purchase();
        c2616e.startapp(f);
        ((C2616e) c14995e.adcel).startapp(f2);
        if (Float.isNaN(purchase)) {
            return;
        }
        boolean z = f >= purchase;
        C1295e startapp = c14995e.startapp();
        C0576e c0576e = (C0576e) c14995e.metrica;
        if (c2616e.purchase() == startapp.purchase(c0576e.getValue())) {
            Object vip = c14995e.startapp().vip(c2616e.purchase() + (z ? 1.0f : -1.0f), z);
            if (vip == null) {
                vip = c0576e.getValue();
            }
            if (z) {
                this.ad = c0576e.getValue();
                this.vip = vip;
            } else {
                this.ad = vip;
                this.vip = c0576e.getValue();
            }
        } else {
            Object vip2 = c14995e.startapp().vip(c2616e.purchase(), false);
            if (vip2 == null) {
                vip2 = c0576e.getValue();
            }
            Object vip3 = c14995e.startapp().vip(c2616e.purchase(), true);
            if (vip3 == null) {
                vip3 = c0576e.getValue();
            }
            this.ad = vip2;
            this.vip = vip3;
        }
        this.metrica = Math.abs(c14995e.startapp().purchase(this.ad) - c14995e.startapp().purchase(this.vip));
        if (Math.abs(c2616e.purchase() - c14995e.startapp().purchase(c0576e.getValue())) >= this.metrica / 2.0f) {
            Object obj = z ? this.vip : this.ad;
            if (obj == null) {
                obj = c0576e.getValue();
            }
            if (((Boolean) ((Function1) c14995e.ad).invoke(obj)).booleanValue()) {
                c14995e.amazon(obj);
            }
        }
    }
}
