package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eۣۘ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C18332e extends AbstractC17471e {
    @Override // defpackage.InterfaceC12462e
    public final void ad(InterfaceC12462e interfaceC12462e) {
        C15380e c15380e = (C15380e) this.vip;
        int i = c15380e.f30320e;
        C17455e c17455e = this.yandex;
        Iterator it = c17455e.advert.iterator();
        int i2 = 0;
        int i3 = -1;
        while (it.hasNext()) {
            int i4 = ((C17455e) it.next()).billing;
            if (i3 == -1 || i4 < i3) {
                i3 = i4;
            }
            if (i2 < i4) {
                i2 = i4;
            }
        }
        if (i == 0 || i == 2) {
            c17455e.license(i3 + c15380e.f30317e);
        } else {
            c17455e.license(i2 + c15380e.f30317e);
        }
    }

    @Override // defpackage.AbstractC17471e
    public final void appmetrica() {
        C11325e c11325e = this.vip;
        if (c11325e instanceof C15380e) {
            int i = ((C15380e) c11325e).f30320e;
            C17455e c17455e = this.yandex;
            if (i == 0 || i == 1) {
                c11325e.f22754strictfp = c17455e.billing;
            } else {
                c11325e.f22749private = c17455e.billing;
            }
        }
    }

    @Override // defpackage.AbstractC17471e
    public final void license() {
        C11325e c11325e = this.vip;
        if (c11325e instanceof C15380e) {
            C17455e c17455e = this.yandex;
            c17455e.vip = true;
            ArrayList arrayList = c17455e.advert;
            C15380e c15380e = (C15380e) c11325e;
            int i = c15380e.f30320e;
            boolean z = c15380e.f30318e;
            int i2 = 0;
            if (i == 0) {
                c17455e.appmetrica = 4;
                while (i2 < c15380e.f28080e) {
                    C11325e c11325e2 = c15380e.f28081e[i2];
                    if (z || c11325e2.f22752return != 8) {
                        C17455e c17455e2 = c11325e2.license.yandex;
                        c17455e2.mopub.add(c17455e);
                        arrayList.add(c17455e2);
                    }
                    i2++;
                }
                smaato(this.vip.license.yandex);
                smaato(this.vip.license.startapp);
                return;
            }
            if (i == 1) {
                c17455e.appmetrica = 5;
                while (i2 < c15380e.f28080e) {
                    C11325e c11325e3 = c15380e.f28081e[i2];
                    if (z || c11325e3.f22752return != 8) {
                        C17455e c17455e3 = c11325e3.license.startapp;
                        c17455e3.mopub.add(c17455e);
                        arrayList.add(c17455e3);
                    }
                    i2++;
                }
                smaato(this.vip.license.yandex);
                smaato(this.vip.license.startapp);
                return;
            }
            if (i == 2) {
                c17455e.appmetrica = 6;
                while (i2 < c15380e.f28080e) {
                    C11325e c11325e4 = c15380e.f28081e[i2];
                    if (z || c11325e4.f22752return != 8) {
                        C17455e c17455e4 = c11325e4.appmetrica.yandex;
                        c17455e4.mopub.add(c17455e);
                        arrayList.add(c17455e4);
                    }
                    i2++;
                }
                smaato(this.vip.appmetrica.yandex);
                smaato(this.vip.appmetrica.startapp);
                return;
            }
            if (i != 3) {
                return;
            }
            c17455e.appmetrica = 7;
            while (i2 < c15380e.f28080e) {
                C11325e c11325e5 = c15380e.f28081e[i2];
                if (z || c11325e5.f22752return != 8) {
                    C17455e c17455e5 = c11325e5.appmetrica.startapp;
                    c17455e5.mopub.add(c17455e);
                    arrayList.add(c17455e5);
                }
                i2++;
            }
            smaato(this.vip.appmetrica.yandex);
            smaato(this.vip.appmetrica.startapp);
        }
    }

    @Override // defpackage.AbstractC17471e
    public final boolean mopub() {
        return false;
    }

    @Override // defpackage.AbstractC17471e
    public final void purchase() {
        this.metrica = null;
        this.yandex.metrica();
    }

    public final void smaato(C17455e c17455e) {
        C17455e c17455e2 = this.yandex;
        c17455e2.mopub.add(c17455e);
        c17455e.advert.add(c17455e2);
    }
}
