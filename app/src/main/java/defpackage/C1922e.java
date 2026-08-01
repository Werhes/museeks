package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import org.conscrypt.BuildConfig;
import org.conscrypt.PSKKeyManager;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؓٚۙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1922e extends AbstractC10347e {

    /* renamed from: eٍؗٚ, reason: contains not printable characters */
    public final C0576e f5116e;

    /* renamed from: eؙِۛ, reason: contains not printable characters */
    public final C0576e f5117e;

    /* renamed from: eٍُٝ, reason: contains not printable characters */
    public final C0576e f5118e;

    /* renamed from: eٗۥۚ, reason: contains not printable characters */
    public final C5363e f5119e;

    public C1922e() {
        super(0);
        this.f5117e = AbstractC14533e.startapp(null);
        this.f5116e = AbstractC14533e.startapp(null);
        this.f5118e = AbstractC14533e.startapp(Boolean.FALSE);
        this.f5119e = new C5363e(new C4215e(this, 4));
    }

    /* renamed from: synchronized, reason: not valid java name */
    public static final C16801e m723synchronized(C1922e c1922e, C16801e c16801e, C10620e c10620e) {
        String str = c10620e.ad;
        String str2 = c10620e.vip;
        List list = c10620e.appmetrica;
        ArrayList arrayList = new ArrayList(AbstractC0746e.subscription(list, 10));
        int i = 0;
        for (Object obj : list) {
            int i2 = i + 1;
            if (i < 0) {
                AbstractC6874e.Signature();
                throw null;
            }
            arrayList.add(new C1050e(((Number) c10620e.license.get(i)).intValue(), (float) ((Number) obj).doubleValue()));
            i = i2;
        }
        return C16801e.vip(c16801e, str, str2, arrayList, 24);
    }

    @Override // defpackage.AbstractC10347e
    /* renamed from: final */
    public final void mo212final(C13770e c13770e, int i) {
        C5958e c5958e;
        C13770e c13770e2;
        c13770e.m3671package(-2030414661);
        int i2 = i | (c13770e.yandex(this) ? 4 : 2);
        int i3 = 0;
        if (c13770e.m3673protected(i2 & 1, (i2 & 3) != 2)) {
            InterfaceC8018e interfaceC8018e = (InterfaceC8018e) this.f5119e.getValue();
            C4000e c4000e = C4000e.f8906e;
            Object m3681throw = c13770e.m3681throw();
            int i4 = 3;
            Object obj = C2987e.ad;
            if (m3681throw == obj) {
                m3681throw = new C18225e(i4, i3, null);
                c13770e.m3682throws(m3681throw);
            }
            C1158e c1158e = C1158e.f3743e;
            C0764e purchase = AbstractC16982e.purchase(interfaceC8018e, c4000e, (Function3) m3681throw, C1158e.license(), c13770e, 0);
            Object m3681throw2 = c13770e.m3681throw();
            if (m3681throw2 == obj) {
                m3681throw2 = AbstractC17680e.startapp(c13770e);
                c13770e.m3682throws(m3681throw2);
            }
            InterfaceC18435e interfaceC18435e = (InterfaceC18435e) m3681throw2;
            Object m3681throw3 = c13770e.m3681throw();
            if (m3681throw3 == obj) {
                C13985e.ad.getClass();
                m3681throw3 = AbstractC8228e.metrica(C13985e.license);
                c13770e.m3682throws(m3681throw3);
            }
            InterfaceC8346e interfaceC8346e = (InterfaceC8346e) m3681throw3;
            C13985e.ad.getClass();
            C12742e c12742e = C13985e.appmetrica;
            C5958e ad = AbstractC9083e.ad(c13770e);
            C10620e c10620e = (C10620e) this.f5116e.getValue();
            if (c10620e == null) {
                c13770e.m3676strictfp(-2058011719);
                c13770e.Signature(false);
                c5958e = ad;
            } else {
                c13770e.m3676strictfp(-2058011718);
                boolean yandex = c13770e.yandex(this);
                Object m3681throw4 = c13770e.m3681throw();
                if (yandex || m3681throw4 == obj) {
                    m3681throw4 = new C4215e(this, 0);
                    c13770e.m3682throws(m3681throw4);
                }
                Function0 function0 = (Function0) m3681throw4;
                boolean yandex2 = c13770e.yandex(c10620e) | c13770e.purchase(purchase) | c13770e.yandex(interfaceC18435e) | c13770e.yandex(this);
                Object m3681throw5 = c13770e.m3681throw();
                if (yandex2 || m3681throw5 == obj) {
                    m3681throw5 = new C9411e(c10620e, interfaceC18435e, this, purchase);
                    c13770e.m3682throws(m3681throw5);
                }
                c5958e = ad;
                m727private(c10620e, function0, (Function0) m3681throw5, c13770e, (i2 << 9) & 7168);
                c13770e.Signature(false);
            }
            C10620e c10620e2 = (C10620e) this.f5117e.getValue();
            if (c10620e2 == null) {
                c13770e.m3676strictfp(-2057435863);
                c13770e.Signature(false);
                c13770e2 = c13770e;
            } else {
                c13770e.m3676strictfp(-2057435862);
                boolean yandex3 = c13770e.yandex(this);
                Object m3681throw6 = c13770e.m3681throw();
                if (yandex3 || m3681throw6 == obj) {
                    m3681throw6 = new C4215e(this, 1);
                    c13770e.m3682throws(m3681throw6);
                }
                Function0 function02 = (Function0) m3681throw6;
                boolean purchase2 = c13770e.purchase(purchase) | c13770e.yandex(interfaceC18435e) | c13770e.yandex(this);
                Object m3681throw7 = c13770e.m3681throw();
                if (purchase2 || m3681throw7 == obj) {
                    m3681throw7 = new C11229e(interfaceC18435e, this, purchase);
                    c13770e.m3682throws(m3681throw7);
                }
                m725instanceof(c10620e2, function02, (Function1) m3681throw7, c13770e, (i2 << 9) & 7168);
                c13770e2 = c13770e;
                c13770e2.Signature(false);
            }
            if (((Boolean) this.f5118e.getValue()).booleanValue()) {
                c13770e2.m3676strictfp(-2056925261);
                boolean yandex4 = c13770e2.yandex(this);
                Object m3681throw8 = c13770e2.m3681throw();
                if (yandex4 || m3681throw8 == obj) {
                    m3681throw8 = new C4215e(this, 3);
                    c13770e2.m3682throws(m3681throw8);
                }
                Function0 function03 = (Function0) m3681throw8;
                boolean purchase3 = c13770e2.purchase(purchase) | c13770e2.yandex(interfaceC18435e) | c13770e2.yandex(this);
                Object m3681throw9 = c13770e2.m3681throw();
                if (purchase3 || m3681throw9 == obj) {
                    m3681throw9 = new C11229e(this, purchase, interfaceC18435e);
                    c13770e2.m3682throws(m3681throw9);
                }
                m728strictfp(function03, (Function1) m3681throw9, c13770e2, (i2 << 6) & 896);
            } else {
                c13770e2.m3676strictfp(-2062586233);
            }
            c13770e2.Signature(false);
            AbstractC13348e.ad(null, AbstractC16653e.license(-554459017, new C17785e(c5958e, this, i3), c13770e2), null, null, null, 0, 0L, 0L, ((C0916e) c13770e2.adcel(AbstractC12450e.ad)).license(c13770e2), AbstractC16653e.license(-1586573044, new C1701e(c5958e, this, c12742e, purchase, interfaceC8346e, 1), c13770e2), c13770e, 805306416, 253);
        } else {
            c13770e.m3659default();
        }
        C2846e subscription = c13770e.subscription();
        if (subscription != null) {
            subscription.license = new C1939e(this, i);
        }
    }

    /* renamed from: import, reason: not valid java name */
    public final void m724import(String str, C13770e c13770e, int i) {
        c13770e.m3671package(-706469667);
        int i2 = i | (c13770e.purchase(str) ? 4 : 2);
        if (c13770e.m3673protected(i2 & 1, (i2 & 3) != 2)) {
            AbstractC14489e.vip(str, null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, ((C7019e) c13770e.adcel(AbstractC11785e.ad)).vip.smaato, c13770e, i2 & 14, 0, 131070);
        } else {
            c13770e.m3659default();
        }
        C2846e subscription = c13770e.subscription();
        if (subscription != null) {
            subscription.license = new C1743e(this, str, i, 29);
        }
    }

    /* renamed from: instanceof, reason: not valid java name */
    public final void m725instanceof(C10620e c10620e, Function0 function0, Function1 function1, C13770e c13770e, int i) {
        int i2;
        Object obj;
        c13770e.m3671package(-1852185155);
        if ((i & 6) == 0) {
            i2 = (c13770e.yandex(c10620e) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= c13770e.yandex(function0) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            obj = function1;
            i2 |= c13770e.yandex(obj) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        } else {
            obj = function1;
        }
        int i3 = i2;
        if (c13770e.m3673protected(i3 & 1, (i3 & 147) != 146)) {
            boolean purchase = c13770e.purchase(c10620e);
            Object m3681throw = c13770e.m3681throw();
            if (purchase || m3681throw == C2987e.ad) {
                m3681throw = AbstractC14533e.startapp(new C0398e(0L, 6, c10620e.vip));
                c13770e.m3682throws(m3681throw);
            }
            InterfaceC3314e interfaceC3314e = (InterfaceC3314e) m3681throw;
            AbstractC9262e.ad(function0, AbstractC16653e.license(-326555643, new C4197e(obj, (Object) c10620e, (Object) interfaceC3314e, false, 9), c13770e), null, AbstractC16653e.license(-1462500089, new C14903e(7, function0), c13770e), null, AbstractC17487e.startapp, AbstractC16653e.license(1128550538, new C6409e(interfaceC3314e, (Object) function0, (Object) function1, (Object) c10620e, 7), c13770e), null, 0L, 0L, 0L, 0L, 0.0f, null, c13770e, ((i3 >> 3) & 14) | 1772592, 0, 16276);
        } else {
            c13770e.m3659default();
        }
        C2846e subscription = c13770e.subscription();
        if (subscription != null) {
            subscription.license = new C7303e(this, c10620e, function0, function1, i, 5);
        }
    }

    /* renamed from: package, reason: not valid java name */
    public final void m726package(Function0 function0, InterfaceC12864e interfaceC12864e, C13770e c13770e, int i) {
        c13770e.m3671package(-1543464210);
        int i2 = i | (c13770e.yandex(function0) ? 4 : 2);
        if (c13770e.m3673protected(i2 & 1, (i2 & 19) != 18)) {
            C15492e c15492e = AbstractC11785e.ad;
            AbstractC0865e.vip(function0, interfaceC12864e, false, null, AbstractC12322e.vip(((C7019e) c13770e.adcel(c15492e)).ad.Signature, ((C7019e) c13770e.adcel(c15492e)).ad.remoteconfig, 0L, 0L, c13770e, 0, 12), null, AbstractC16619e.ad(1, ((C7019e) c13770e.adcel(c15492e)).ad.subscription), AbstractC17487e.Signature, c13770e, (i2 & 14) | 100663344, 172);
        } else {
            c13770e.m3659default();
        }
        C2846e subscription = c13770e.subscription();
        if (subscription != null) {
            subscription.license = new C4197e(this, function0, interfaceC12864e, i, 11);
        }
    }

    /* renamed from: private, reason: not valid java name */
    public final void m727private(C10620e c10620e, Function0 function0, Function0 function02, C13770e c13770e, int i) {
        int i2;
        c13770e.m3671package(47368937);
        if ((i & 6) == 0) {
            i2 = (c13770e.yandex(c10620e) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= c13770e.yandex(function0) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= c13770e.yandex(function02) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        if (c13770e.m3673protected(i2 & 1, (i2 & 147) != 146)) {
            AbstractC9262e.ad(function0, AbstractC16653e.license(1572998449, new C14903e(5, function02), c13770e), null, AbstractC16653e.license(437054003, new C14903e(6, function0), c13770e), null, AbstractC17487e.purchase, AbstractC16653e.license(-1266862666, new C11213e(24, c10620e), c13770e), null, 0L, 0L, 0L, 0L, 0.0f, null, c13770e, ((i2 >> 3) & 14) | 1772592, 0, 16276);
        } else {
            c13770e.m3659default();
        }
        C2846e subscription = c13770e.subscription();
        if (subscription != null) {
            subscription.license = new C7303e(this, c10620e, function0, function02, i, 4);
        }
    }

    /* renamed from: strictfp, reason: not valid java name */
    public final void m728strictfp(Function0 function0, Function1 function1, C13770e c13770e, int i) {
        int i2;
        c13770e.m3671package(890467652);
        if ((i & 6) == 0) {
            i2 = i | (c13770e.yandex(function0) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= c13770e.yandex(function1) ? 32 : 16;
        }
        int i3 = i2;
        if (c13770e.m3673protected(i3 & 1, (i3 & 19) != 18)) {
            Object m3681throw = c13770e.m3681throw();
            if (m3681throw == C2987e.ad) {
                m3681throw = AbstractC14533e.startapp(new C0398e(0L, 6, BuildConfig.FLAVOR));
                c13770e.m3682throws(m3681throw);
            }
            InterfaceC3314e interfaceC3314e = (InterfaceC3314e) m3681throw;
            AbstractC9262e.ad(function0, AbstractC16653e.license(538986380, new C1743e(function1, interfaceC3314e), c13770e), null, AbstractC16653e.license(662268046, new C14903e(8, function0), c13770e), null, AbstractC17487e.smaato, AbstractC16653e.license(-1300293103, new C4197e((Object) function0, (Object) function1, (Object) interfaceC3314e, false, 10), c13770e), null, 0L, 0L, 0L, 0L, 0.0f, null, c13770e, (i3 & 14) | 1772592, 0, 16276);
        } else {
            c13770e.m3659default();
        }
        C2846e subscription = c13770e.subscription();
        if (subscription != null) {
            subscription.license = new C9381e(i, 13, this, function0, function1);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:49:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x004f  */
    /* renamed from: transient, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m729transient(defpackage.C2892e r17, defpackage.C2892e r18, boolean r19, kotlin.jvm.functions.Function0 r20, defpackage.InterfaceC12864e r21, kotlin.jvm.functions.Function2 r22, defpackage.C13770e r23, int r24, int r25) {
        /*
            Method dump skipped, instructions count: 609
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C1922e.m729transient(eؔ۟ٓ, eؔ۟ٓ, boolean, kotlin.jvm.functions.Function0, eّۤۧ, kotlin.jvm.functions.Function2, eٓؕۥ, int, int):void");
    }
}
