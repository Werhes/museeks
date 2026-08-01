package defpackage;

import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٟؑؒ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC0468e {
    public final Function0 ad;
    public final Object metrica;
    public final C6427e vip;

    public AbstractC0468e(Function0 function0, C6427e c6427e) {
        this.ad = function0;
        this.vip = c6427e;
        final int i = 0;
        this.metrica = AbstractC18039e.appmetrica(3, new Function0(this) { // from class: eٖۛۡ

            /* renamed from: eؘٙؓ, reason: contains not printable characters */
            public final /* synthetic */ AbstractC0468e f32323e;

            {
                this.f32323e = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                AbstractC0468e abstractC0468e = this.f32323e;
                switch (i2) {
                    case 0:
                        String mo459e = abstractC0468e.vip.mo459e("Content-Disposition");
                        if (mo459e == null) {
                            return null;
                        }
                        C16855e c16855e = (C16855e) AbstractC13480e.m3570break(AbstractC16082e.vip(mo459e));
                        return new AbstractC11130e(c16855e.ad, c16855e.vip, false, 10);
                    default:
                        String mo459e2 = abstractC0468e.vip.mo459e("Content-Type");
                        if (mo459e2 == null) {
                            return null;
                        }
                        C1622e c1622e = C1622e.f4539e;
                        return AbstractC6227e.metrica(mo459e2);
                }
            }
        });
        final int i2 = 1;
        AbstractC18039e.appmetrica(3, new Function0(this) { // from class: eٖۛۡ

            /* renamed from: eؘٙؓ, reason: contains not printable characters */
            public final /* synthetic */ AbstractC0468e f32323e;

            {
                this.f32323e = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                AbstractC0468e abstractC0468e = this.f32323e;
                switch (i22) {
                    case 0:
                        String mo459e = abstractC0468e.vip.mo459e("Content-Disposition");
                        if (mo459e == null) {
                            return null;
                        }
                        C16855e c16855e = (C16855e) AbstractC13480e.m3570break(AbstractC16082e.vip(mo459e));
                        return new AbstractC11130e(c16855e.ad, c16855e.vip, false, 10);
                    default:
                        String mo459e2 = abstractC0468e.vip.mo459e("Content-Type");
                        if (mo459e2 == null) {
                            return null;
                        }
                        C1622e c1622e = C1622e.f4539e;
                        return AbstractC6227e.metrica(mo459e2);
                }
            }
        });
    }
}
