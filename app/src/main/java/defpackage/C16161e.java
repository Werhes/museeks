package defpackage;

import java.util.ArrayList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import ua.itaysonlab.vkx.R;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eّٖۖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C16161e extends AbstractC10347e {

    /* renamed from: eٍؗٚ, reason: contains not printable characters */
    public final C0576e f31741e;

    /* renamed from: eؙِۛ, reason: contains not printable characters */
    public final ArrayList f31742e;

    public C16161e() {
        super(0);
        ArrayList arrayList = new ArrayList();
        C1630e c1630e = new C1630e(0, EnumC3562e.f8031e);
        while (c1630e.hasNext()) {
            Object next = c1630e.next();
            if (((EnumC3562e) next).f8034e) {
                arrayList.add(next);
            }
        }
        this.f31742e = arrayList;
        C15409e c15409e = C15409e.ad;
        c15409e.getClass();
        C12309e c12309e = C15409e.loadAd;
        InterfaceC8614e interfaceC8614e = C15409e.vip[9];
        this.f31741e = AbstractC14533e.startapp((Boolean) c12309e.tapsense(c15409e));
    }

    @Override // defpackage.AbstractC10347e
    /* renamed from: final */
    public final void mo212final(C13770e c13770e, int i) {
        C13770e c13770e2;
        c13770e.m3671package(688305982);
        int i2 = (c13770e.yandex(this) ? 4 : 2) | i;
        if (c13770e.m3673protected(i2 & 1, (i2 & 3) != 2)) {
            boolean yandex = c13770e.yandex(this);
            Object m3681throw = c13770e.m3681throw();
            C5170e c5170e = C2987e.ad;
            if (yandex || m3681throw == c5170e) {
                C15101e c15101e = new C15101e(0, this, C16161e.class, "onNavigationIconClicked", "onNavigationIconClicked()V", 0, 0, 4);
                c13770e.m3682throws(c15101e);
                m3681throw = c15101e;
            }
            Function0 function0 = (Function0) ((InterfaceC5261e) m3681throw);
            boolean yandex2 = c13770e.yandex(this);
            Object m3681throw2 = c13770e.m3681throw();
            if (yandex2 || m3681throw2 == c5170e) {
                m3681throw2 = new C10739e(22, this);
                c13770e.m3682throws(m3681throw2);
            }
            c13770e2 = c13770e;
            AbstractC11575e.ad(AbstractC10077e.ad, function0, null, (Function1) m3681throw2, c13770e2, 6, 4);
        } else {
            c13770e2 = c13770e;
            c13770e2.m3659default();
        }
        C2846e subscription = c13770e2.subscription();
        if (subscription != null) {
            subscription.license = new C9234e(this, i);
        }
    }

    /* renamed from: strictfp, reason: not valid java name */
    public final void m4137strictfp(boolean z) {
        if (z) {
            new C17180e(R.string.libvkx_enable_warn_title, R.string.libvkx_enable_warn_desc, R.string.cancel, null, new C5938e(this, 1), new C5938e(this, 2), new C5938e(this, 3), 32).signatures(pro());
        } else {
            this.f31741e.setValue(Boolean.FALSE);
            C15409e.ad.ad(false);
        }
    }
}
