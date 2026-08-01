package defpackage;

import kotlin.Unit;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٓٙ۠, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C14068e implements InterfaceC2541e {
    public final C15074e ad;

    public C14068e(C15074e c15074e) {
        this.ad = c15074e;
    }

    @Override // defpackage.InterfaceC2541e
    public final void ad(C4017e c4017e) {
        Object obj = AbstractC15384e.ad;
        C15074e c15074e = this.ad;
        C10810e c10810e = c15074e.f29854e;
        if (!c10810e.ad()) {
            c10810e = null;
        }
        if (c10810e == null) {
            c10810e = c15074e.f29849e.appmetrica;
            if (!c10810e.ad()) {
                c10810e = null;
            }
            if (c10810e == null) {
                c10810e = c15074e.f29836e.appmetrica;
            }
        }
        if (!c10810e.ad()) {
            c10810e = null;
        }
        if (c10810e == null) {
            c10810e = (C10810e) AbstractC13480e.m3604this(AbstractC15384e.purchase(c15074e));
            if (c10810e != null) {
                AbstractC4457e abstractC4457e = c10810e.metrica;
                float license = AbstractC15384e.license(c15074e);
                if (Float.isNaN(license)) {
                    license = 0;
                }
                if (abstractC4457e == null) {
                    if (Float.isNaN(license)) {
                        license = AbstractC15863e.ad;
                    }
                    long j = c10810e.ad;
                    float license2 = C3618e.license(j) * ((license / 72) + 1);
                    if (license2 > 1.0f) {
                        license2 = 1.0f;
                    }
                    c10810e = new C10810e(C3618e.vip(license2, j), c10810e.vip, abstractC4457e);
                }
            } else {
                c10810e = null;
            }
            if (c10810e == null) {
                return;
            }
        }
        float f = c15074e.f29851e;
        if (f >= 1.0f) {
            C7127e c7127e = c15074e.f29843e;
            AbstractC1798e.startapp(c4017e, c10810e, c15074e, 0L, c4017e.yandex(), c7127e != null ? C8738e.vip(c7127e) : null);
            return;
        }
        InterfaceC2661e interfaceC2661e = (InterfaceC2661e) AbstractC10432e.vip(c15074e, AbstractC11473e.billing);
        C16446e metrica = interfaceC2661e.metrica();
        try {
            metrica.purchase(f);
            c4017e.remoteconfig(AbstractC8116e.yandex(c4017e.yandex()), metrica, new C17874e(c10810e, this, 21));
            C17138e.metrica(c4017e, metrica);
            Unit unit = Unit.INSTANCE;
        } finally {
            interfaceC2661e.ad(metrica);
        }
    }

    @Override // defpackage.InterfaceC2541e
    public final /* bridge */ void vip() {
    }
}
