package defpackage;

import androidx.car.app.adcel;
import androidx.car.app.utils.purchase;
import androidx.car.app.vip;
import java.util.ArrayDeque;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: e٘۠ؖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C18047e implements InterfaceC6457e {
    public final ArrayDeque ad = new ArrayDeque();
    public final C4891e metrica;
    public final adcel vip;

    public C18047e(adcel adcelVar, C4891e c4891e) {
        this.vip = adcelVar;
        this.metrica = c4891e;
        c4891e.ad(new C8344e(3, this));
    }

    public static void vip(C6436e c6436e, boolean z) {
        EnumC7785e enumC7785e = c6436e.f13327e.license;
        if (enumC7785e.ad(EnumC7785e.f15776e)) {
            c6436e.metrica(EnumC14621e.ON_PAUSE);
        }
        if (enumC7785e.ad(EnumC7785e.f15779e)) {
            c6436e.metrica(EnumC14621e.ON_STOP);
        }
        if (z) {
            c6436e.metrica(EnumC14621e.ON_DESTROY);
        }
    }

    public final void ad(C6436e c6436e, boolean z) {
        this.ad.push(c6436e);
        EnumC7785e enumC7785e = EnumC7785e.f15777e;
        C4891e c4891e = this.metrica;
        if (z && c4891e.license.ad(enumC7785e)) {
            c6436e.metrica(EnumC14621e.ON_CREATE);
        }
        if (c6436e.f13327e.license.ad(enumC7785e) && c4891e.license.ad(EnumC7785e.f15779e)) {
            purchase.license("invalidate", new C9509e(5, ((vip) this.vip.vip(vip.class)).metrica, "invalidate", new C4403e(8)));
            c6436e.metrica(EnumC14621e.ON_START);
        }
    }
}
