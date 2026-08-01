package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.conscrypt.PSKKeyManager;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؔۘۜ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2809e {
    public final C0576e ad = AbstractC14533e.startapp(null);
    public final C12742e metrica;
    public C10566e vip;

    public C2809e(C10566e c10566e) {
        C4671e c4671e = new C4671e(27);
        c10566e.getClass();
        C9122e c9122e = new C9122e(c10566e);
        ArrayList arrayList = c9122e.f18276e;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            List list = (List) c4671e.invoke(((C9634e) arrayList.get(i)).ad(RecyclerView.UNDEFINED_DURATION));
            ArrayList arrayList3 = new ArrayList(list.size());
            int size2 = list.size();
            for (int i2 = 0; i2 < size2; i2++) {
                C9363e c9363e = (C9363e) list.get(i2);
                arrayList3.add(new C9634e(c9363e.ad, c9363e.vip, c9363e.metrica, c9363e.license));
            }
            AbstractC13480e.inmobi(arrayList2, arrayList3);
        }
        arrayList.clear();
        arrayList.addAll(arrayList2);
        this.vip = c9122e.purchase();
        this.metrica = new C12742e();
    }

    public static C9363e metrica(C9363e c9363e, C12476e c12476e) {
        int metrica = c12476e.vip.metrica(r4.purchase - 1, false);
        if (c9363e.vip < metrica) {
            return C9363e.ad(c9363e, null, 0, Math.min(c9363e.metrica, metrica), 11);
        }
        return null;
    }

    public final void ad(C13770e c13770e, int i) {
        int i2;
        char c;
        boolean z;
        c13770e.m3671package(1154651354);
        char c2 = 2;
        int i3 = (c13770e.yandex(this) ? 4 : 2) | i;
        boolean z2 = false;
        if (c13770e.m3673protected(i3 & 1, (i3 & 3) != 2)) {
            C1774e c1774e = (C1774e) c13770e.adcel(AbstractC11473e.remoteconfig);
            C10566e c10566e = this.vip;
            List ad = c10566e.ad(c10566e.f20850e.length());
            int size = ad.size();
            int i4 = 0;
            while (i4 < size) {
                C9363e c9363e = (C9363e) ad.get(i4);
                int i5 = c9363e.vip;
                Object obj = c9363e.ad;
                if (i5 != c9363e.metrica) {
                    c13770e.m3676strictfp(725478935);
                    Object m3681throw = c13770e.m3681throw();
                    Object obj2 = C2987e.ad;
                    if (m3681throw == obj2) {
                        m3681throw = AbstractC17861e.adcel(c13770e);
                    }
                    C15274e c15274e = (C15274e) m3681throw;
                    c = c2;
                    InterfaceC12864e yandex = AbstractC12546e.yandex(C0115e.f1276e, new C6538e(this, c9363e, 26));
                    Object m3681throw2 = c13770e.m3681throw();
                    int i6 = 28;
                    if (m3681throw2 == obj2) {
                        m3681throw2 = new C4671e(i6);
                        c13770e.m3682throws(m3681throw2);
                    }
                    InterfaceC12864e yandex2 = AbstractC9764e.yandex(AbstractC1147e.ad(yandex, z2, (Function1) m3681throw2).premium(new C15330e(new C18070e(this, c9363e, 27))), c15274e);
                    InterfaceC15690e.ad.getClass();
                    InterfaceC12864e metrica = AbstractC3192e.metrica(yandex2, AbstractC16653e.metrica);
                    boolean yandex3 = c13770e.yandex(this) | c13770e.purchase(c9363e) | c13770e.yandex(c1774e);
                    Object m3681throw3 = c13770e.m3681throw();
                    if (yandex3 || m3681throw3 == obj2) {
                        m3681throw3 = new C5565e(this, c9363e, c1774e);
                        c13770e.m3682throws(m3681throw3);
                    }
                    AbstractC17074e.ad(AbstractC9546e.appmetrica(metrica, c15274e, null, false, null, (Function0) m3681throw3, 508), c13770e, 0);
                    AbstractC9606e abstractC9606e = (AbstractC9606e) obj;
                    C2233e vip = abstractC9606e.vip();
                    if (vip == null || (vip.ad == null && vip.vip == null && vip.metrica == null && vip.license == null)) {
                        i2 = i3;
                        z = false;
                        c13770e.m3676strictfp(728331710);
                        c13770e.Signature(false);
                    } else {
                        c13770e.m3676strictfp(726303039);
                        Object m3681throw4 = c13770e.m3681throw();
                        if (m3681throw4 == obj2) {
                            m3681throw4 = new C13310e(c15274e);
                            c13770e.m3682throws(m3681throw4);
                        }
                        C13310e c13310e = (C13310e) m3681throw4;
                        Unit unit = Unit.INSTANCE;
                        Object m3681throw5 = c13770e.m3681throw();
                        InterfaceC5083e interfaceC5083e = null;
                        if (m3681throw5 == obj2) {
                            m3681throw5 = new C7236e(c13310e, interfaceC5083e, 28);
                            c13770e.m3682throws(m3681throw5);
                        }
                        AbstractC17680e.license(c13770e, unit, (Function2) m3681throw5);
                        C16330e c16330e = c13310e.vip;
                        C16330e c16330e2 = c13310e.vip;
                        Boolean valueOf = Boolean.valueOf((c16330e.purchase() & 2) != 0);
                        Boolean valueOf2 = Boolean.valueOf((c16330e2.purchase() & 1) != 0);
                        Boolean valueOf3 = Boolean.valueOf((c16330e2.purchase() & 4) != 0);
                        C2233e vip2 = abstractC9606e.vip();
                        C4282e c4282e = vip2 != null ? vip2.ad : null;
                        i2 = i3;
                        C2233e vip3 = abstractC9606e.vip();
                        C4282e c4282e2 = vip3 != null ? vip3.vip : null;
                        C2233e vip4 = abstractC9606e.vip();
                        C4282e c4282e3 = vip4 != null ? vip4.metrica : null;
                        C2233e vip5 = abstractC9606e.vip();
                        C4282e c4282e4 = vip5 != null ? vip5.license : null;
                        C4282e c4282e5 = c4282e3;
                        Object[] objArr = new Object[7];
                        objArr[0] = valueOf;
                        objArr[1] = valueOf2;
                        objArr[c] = valueOf3;
                        objArr[3] = c4282e;
                        objArr[4] = c4282e2;
                        objArr[5] = c4282e5;
                        objArr[6] = c4282e4;
                        boolean yandex4 = c13770e.yandex(this) | c13770e.purchase(c9363e);
                        Object m3681throw6 = c13770e.m3681throw();
                        if (yandex4 || m3681throw6 == obj2) {
                            m3681throw6 = new C6538e(25, this, c9363e, c13310e);
                            c13770e.m3682throws(m3681throw6);
                        }
                        vip(objArr, (Function1) m3681throw6, c13770e, (i2 << 6) & 896);
                        z = false;
                        c13770e.Signature(false);
                    }
                    c13770e.Signature(z);
                } else {
                    i2 = i3;
                    c = c2;
                    z = z2;
                    c13770e.m3676strictfp(728345598);
                    c13770e.Signature(z);
                }
                i4++;
                z2 = z;
                i3 = i2;
                c2 = c;
            }
        } else {
            c13770e.m3659default();
        }
        C2846e subscription = c13770e.subscription();
        if (subscription != null) {
            subscription.license = new C3450e(this, i, 22);
        }
    }

    public final void vip(Object[] objArr, Function1 function1, C13770e c13770e, int i) {
        c13770e.m3671package(-2083052099);
        int i2 = (i & 48) == 0 ? (c13770e.yandex(function1) ? 32 : 16) | i : i;
        if ((i & 384) == 0) {
            i2 |= c13770e.yandex(this) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        c13770e.m3662final(-358306546, Integer.valueOf(objArr.length));
        int i3 = i2 | (c13770e.license(objArr.length) ? 4 : 0);
        for (Object obj : objArr) {
            i3 |= c13770e.yandex(obj) ? 4 : 0;
        }
        c13770e.Signature(false);
        if ((i3 & 14) == 0) {
            i3 |= 2;
        }
        if (c13770e.m3673protected(i3 & 1, (i3 & 147) != 146)) {
            C6325e c6325e = new C6325e(2);
            ArrayList arrayList = (ArrayList) c6325e.f13170e;
            c6325e.premium(function1);
            c6325e.subs(objArr);
            Object[] array = arrayList.toArray(new Object[arrayList.size()]);
            boolean yandex = c13770e.yandex(this) | ((i3 & 112) == 32);
            Object m3681throw = c13770e.m3681throw();
            if (yandex || m3681throw == C2987e.ad) {
                m3681throw = new C13663e(this, function1, 1);
                c13770e.m3682throws(m3681throw);
            }
            AbstractC17680e.metrica(array, (Function1) m3681throw, c13770e);
        } else {
            c13770e.m3659default();
        }
        C2846e subscription = c13770e.subscription();
        if (subscription != null) {
            subscription.license = new C9381e(i, 22, this, objArr, function1);
        }
    }
}
