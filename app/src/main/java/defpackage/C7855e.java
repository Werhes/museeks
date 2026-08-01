package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.conscrypt.PSKKeyManager;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًَۢ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7855e extends AbstractC16997e {

    /* renamed from: eٍؗٚ, reason: contains not printable characters */
    public final ArrayList f15902e;

    /* renamed from: eٍُٝ, reason: contains not printable characters */
    public final C12742e f15903e;

    public C7855e(C0160e c0160e, Integer num) {
        super(false, 3);
        C12742e c12742e;
        List list = c0160e.ad;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof C16523e) {
                arrayList.add(obj);
            }
        }
        this.f15902e = arrayList;
        if (num != null) {
            String str = ((C16523e) list.get(num.intValue())).metrica;
            Iterator it = arrayList.iterator();
            int i = 0;
            while (true) {
                if (!it.hasNext()) {
                    i = -1;
                    break;
                } else if (AbstractC7890e.billing(((C16523e) it.next()).metrica, str)) {
                    break;
                } else {
                    i++;
                }
            }
            Integer[] numArr = {Integer.valueOf(i)};
            c12742e = new C12742e();
            c12742e.addAll(AbstractC1660e.m670implements(numArr));
        } else {
            c12742e = new C12742e();
        }
        this.f15903e = c12742e;
    }

    public final void isVip(boolean z, String str, InterfaceC16154e interfaceC16154e, Function0 function0, C13770e c13770e, int i) {
        long j;
        long j2;
        c13770e.m3671package(1519205633);
        int i2 = i | (c13770e.billing(z) ? 4 : 2) | (c13770e.purchase(str) ? 32 : 16) | (c13770e.purchase(interfaceC16154e) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128) | (c13770e.yandex(function0) ? 2048 : 1024);
        if (c13770e.m3673protected(i2 & 1, (i2 & 1171) != 1170)) {
            if (z) {
                c13770e.m3676strictfp(-1710077108);
                j = C3618e.vip(0.25f, ((C7019e) c13770e.adcel(AbstractC11785e.ad)).ad.ad);
                c13770e.Signature(false);
            } else {
                c13770e.m3676strictfp(-1709987952);
                c13770e.Signature(false);
                j = C3618e.startapp;
            }
            InterfaceC16132e ad = AbstractC3145e.ad(j, null, null, null, c13770e, 0, 14);
            if (z) {
                c13770e.m3676strictfp(-1709839648);
                j2 = ((C7019e) c13770e.adcel(AbstractC11785e.ad)).ad.ad;
                c13770e.Signature(false);
            } else {
                c13770e.m3676strictfp(-1709768937);
                j2 = ((C7019e) c13770e.adcel(AbstractC11785e.ad)).ad.remoteconfig;
                c13770e.Signature(false);
            }
            long j3 = ((C3618e) AbstractC3145e.ad(j2, null, null, null, c13770e, 0, 14).getValue()).ad;
            C1839e c1839e = ((C7019e) c13770e.adcel(AbstractC11785e.ad)).vip.purchase;
            InterfaceC12864e vip = AbstractC12447e.vip(C0115e.f1276e, interfaceC16154e);
            boolean purchase = c13770e.purchase(ad);
            Object m3681throw = c13770e.m3681throw();
            if (purchase || m3681throw == C2987e.ad) {
                m3681throw = new C17652e(ad, 8);
                c13770e.m3682throws(m3681throw);
            }
            AbstractC14489e.vip(str, AbstractC18007e.metrica(AbstractC12220e.advert(AbstractC9546e.license(AbstractC5750e.metrica(vip, (Function1) m3681throw), false, null, function0, 15), 16, 8), 1.0f), j3, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, c1839e, c13770e, (i2 >> 3) & 14, 0, 131064);
        } else {
            c13770e.m3659default();
        }
        C2846e subscription = c13770e.subscription();
        if (subscription != null) {
            subscription.license = new C2535e(this, z, str, interfaceC16154e, function0, i, 5);
        }
    }

    @Override // defpackage.AbstractC16997e
    public final void tapsense(C13770e c13770e, int i) {
        c13770e.m3671package(468898952);
        int i2 = (c13770e.yandex(this) ? 4 : 2) | i;
        if (c13770e.m3673protected(i2 & 1, (i2 & 3) != 2)) {
            Integer num = (Integer) AbstractC13480e.m3604this(this.f15903e);
            AbstractC12121e.ad(null, null, 0L, 0L, 0.0f, 0.0f, null, AbstractC16653e.license(-260738739, new C2173e(AbstractC9735e.ad(num != null ? num.intValue() : 0, 2, c13770e), this, 6), c13770e), c13770e, 12582912, 127);
        } else {
            c13770e.m3659default();
        }
        C2846e subscription = c13770e.subscription();
        if (subscription != null) {
            subscription.license = new C3450e(this, i, 17);
        }
    }
}
