package defpackage;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import org.conscrypt.PSKKeyManager;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٖٔۢ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC14753e {
    public static final C11315e ad = new C11315e(1.0f, 1.0f);

    public static final void ad(long j, C1839e c1839e, C2892e c2892e, C13770e c13770e, int i) {
        int i2;
        c13770e.m3671package(-1206445228);
        if ((i & 6) == 0) {
            i2 = (c13770e.appmetrica(j) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= c13770e.purchase(c1839e) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= c13770e.yandex(c2892e) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        if (c13770e.m3673protected(i2 & 1, (i2 & 147) != 146)) {
            C5015e c5015e = AbstractC14489e.ad;
            AbstractC1101e.vip(new C14815e[]{AbstractC8703e.loadAd(j, AbstractC0608e.ad), c5015e.ad(((C1839e) c13770e.adcel(c5015e)).appmetrica(c1839e))}, c2892e, c13770e, ((i2 >> 3) & 112) | 8);
        } else {
            c13770e.m3659default();
        }
        C2846e subscription = c13770e.subscription();
        if (subscription != null) {
            subscription.license = new C16309e(j, c1839e, c2892e, i, 1);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ C11883e appmetrica(View view, Object obj) {
        return new C11883e(obj, new C2899e(0, view), 0 == true ? 1 : 0, 23);
    }

    public static final AbstractC10727e license(InterfaceC4082e interfaceC4082e, Context context, int i) {
        return interfaceC4082e instanceof C9814e ? AbstractC11765e.ad(new C1362e(((C9814e) interfaceC4082e).ad), i) : interfaceC4082e instanceof C3519e ? new C5530e(AbstractC15143e.ad(interfaceC4082e, context.getResources()).mutate()) : new C2002e(interfaceC4082e);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final defpackage.C8650e metrica(defpackage.C5867e r5, defpackage.AbstractC10731e r6) {
        /*
            boolean r0 = r6 instanceof defpackage.C2945e
            if (r0 == 0) goto L13
            r0 = r6
            eؔۢۜ r0 = (defpackage.C2945e) r0
            int r1 = r0.f6934e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f6934e = r1
            goto L18
        L13:
            eؔۢۜ r0 = new eؔۢۜ
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f6935e
            int r0 = r0.f6934e
            r1 = 0
            if (r0 == 0) goto L3f
            r5 = 1
            if (r0 != r5) goto L37
            defpackage.AbstractC2003e.purchase(r6)
            eًؑۤ r6 = (defpackage.C0193e) r6
            if (r6 == 0) goto L32
            eًٍۚ r5 = new eًٍۚ
            r5.<init>(r6)
            r6 = r1
            r0 = r6
            r2 = r0
            goto L56
        L32:
            r5 = r1
            r6 = r5
            r0 = r6
            r2 = r0
            goto L52
        L37:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L3f:
            defpackage.AbstractC2003e.purchase(r6)
            eۣۡ r6 = new eۣۡ
            r0 = 23
            r6.<init>(r0)
            java.lang.String r0 = r5.ad
            r6.m4486e(r0)
            java.lang.String r0 = r5.vip
            r2 = r0
            r0 = r6
        L52:
            r4 = r6
            r6 = r5
            r5 = r1
            r1 = r4
        L56:
            r1.m4494e(r2, r5)
            eٍؚؑ r5 = r6.metrica
            java.util.ArrayList r6 = new java.util.ArrayList
            r1 = 20
            r6.<init>(r1)
            java.util.Map r5 = r5.ad
            java.util.Set r5 = r5.entrySet()
            java.util.Iterator r5 = r5.iterator()
        L6c:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto La6
            java.lang.Object r1 = r5.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getKey()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r1 = r1.getValue()
            java.util.List r1 = (java.util.List) r1
            java.util.Iterator r1 = r1.iterator()
        L88:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L6c
            java.lang.Object r3 = r1.next()
            java.lang.String r3 = (java.lang.String) r3
            defpackage.AbstractC3149e.appmetrica(r2)
            r6.add(r2)
            java.lang.CharSequence r3 = defpackage.AbstractC5304e.m1855const(r3)
            java.lang.String r3 = r3.toString()
            r6.add(r3)
            goto L88
        La6:
            eٕۡۡ r5 = new eٕۡۡ
            r1 = 0
            java.lang.String[] r1 = new java.lang.String[r1]
            java.lang.Object[] r6 = r6.toArray(r1)
            java.lang.String[] r6 = (java.lang.String[]) r6
            r5.<init>(r6)
            r0.getClass()
            eؚٕۡ r5 = r5.yandex()
            r0.f36192e = r5
            eٌّۢ r5 = new eٌّۢ
            r5.<init>(r0)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC14753e.metrica(eؘۙؓ, eُؑ۠):eٌّۢ");
    }

    public static final C12591e vip(C11058e c11058e) {
        InterfaceC4895e mo1012e;
        int i = c11058e.f21942e;
        long j = c11058e.f21933e;
        long j2 = c11058e.f21932e;
        C15793e c15793e = c11058e.f21946e;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = c15793e.iterator();
        while (true) {
            C1630e c1630e = (C1630e) it;
            if (!c1630e.hasNext()) {
                break;
            }
            C6571e c6571e = (C6571e) c1630e.next();
            String str = (String) c6571e.f13544e;
            String str2 = (String) c6571e.f13543e;
            String lowerCase = str.toLowerCase(Locale.ROOT);
            Object obj = linkedHashMap.get(lowerCase);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap.put(lowerCase, obj);
            }
            ((List) obj).add(str2);
        }
        C9171e c9171e = new C9171e(AbstractC10064e.advert(linkedHashMap));
        AbstractC12834e abstractC12834e = c11058e.f21945e;
        return new C12591e(i, j, j2, c9171e, (abstractC12834e == null || (mo1012e = abstractC12834e.mo1012e()) == null) ? null : new C14720e(mo1012e), c11058e);
    }
}
