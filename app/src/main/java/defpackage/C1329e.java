package defpackage;

import j$.util.Objects;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؒۛٞ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public class C1329e extends AbstractC12670e {
    public AbstractC12614e billing() {
        int i = this.vip;
        if (i == 0) {
            int i2 = AbstractC12614e.f25334e;
            return C4477e.f9679e;
        }
        if (i != 1) {
            AbstractC12614e Signature = AbstractC12614e.Signature(i, this.ad);
            this.vip = Signature.size();
            this.metrica = true;
            return Signature;
        }
        Object obj = this.ad[0];
        Objects.requireNonNull(obj);
        int i3 = AbstractC12614e.f25334e;
        return new C8892e(obj);
    }

    @Override // defpackage.AbstractC13584e
    /* renamed from: purchase, reason: merged with bridge method [inline-methods] */
    public C1329e ad(Object obj) {
        obj.getClass();
        metrica(obj);
        return this;
    }
}
