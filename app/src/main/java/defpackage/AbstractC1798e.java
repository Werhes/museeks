package defpackage;

import java.util.Collections;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙؓٓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC1798e implements InterfaceC14403e {

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public static final C2892e f4862e = new C2892e(142092563, false, new C11832e(19));

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public static final C2892e f4860e = new C2892e(-1389267306, false, new C11832e(20));

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public static final C2892e f4859e = new C2892e(963590935, false, new C11832e(21));

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public static final C2892e f4861e = new C2892e(604417226, false, new C11832e(22));

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public static final C2892e f4858e = new C2892e(2141365645, false, new C11832e(23));

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public static final C2892e f4863e = new C2892e(-209629746, false, new C11832e(24));

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00d7  */
    /* JADX WARN: Type inference failed for: r0v3, types: [eٌّؒ, eٔؐۜ] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final defpackage.C1962e license(defpackage.C14609e r22, android.net.Uri r23, java.lang.String r24) {
        /*
            Method dump skipped, instructions count: 417
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC1798e.license(eٌٔۤ, android.net.Uri, java.lang.String):eِؓٝ");
    }

    public static final C16446e purchase(C4017e c4017e, C15074e c15074e, float f, long j, long j2) {
        long purchase = AbstractC8116e.purchase(C2108e.yandex(f, j));
        if (((int) (purchase >> 32)) <= 0 || ((int) (4294967295L & purchase)) <= 0) {
            return null;
        }
        C16446e metrica = ((InterfaceC2661e) AbstractC10432e.vip(c15074e, AbstractC11473e.billing)).metrica();
        c4017e.remoteconfig(purchase, metrica, new C17990e(c15074e, f, j2, 0));
        return metrica;
    }

    public static final void startapp(InterfaceC2235e interfaceC2235e, C10810e c10810e, InterfaceC1683e interfaceC1683e, long j, long j2, AbstractC4457e abstractC4457e) {
        AbstractC4457e abstractC4457e2 = c10810e.metrica;
        if (abstractC4457e2 != null) {
            if (abstractC4457e != null) {
                AbstractC12662e.purchase(interfaceC1683e, new C8830e(interfaceC2235e, j, c10810e, abstractC4457e));
                return;
            } else {
                AbstractC4653e.admob(interfaceC2235e, abstractC4457e2, j, interfaceC2235e.yandex(), 0.0f, null, null, c10810e.vip, 56);
                return;
            }
        }
        if (abstractC4457e != null) {
            AbstractC4653e.admob(interfaceC2235e, abstractC4457e, j, interfaceC2235e.yandex(), 0.0f, null, new C2815e(c10810e.ad, 5), 0, 88);
        } else {
            AbstractC4653e.subscription(interfaceC2235e, c10810e.ad, 0L, j2, 0.0f, null, null, c10810e.vip, 58);
        }
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [eٌّؒ, eٔؐۜ] */
    public static final C1962e vip(C14609e c14609e) {
        C9466e c9466e = new C9466e();
        C2171e c2171e = AbstractC17475e.f34223e;
        C1410e c1410e = C1410e.f4222e;
        List list = Collections.EMPTY_LIST;
        C1410e c1410e2 = C1410e.f4222e;
        C9457e c9457e = new C9457e();
        return new C1962e(c14609e.ad, new C14435e(c9466e), null, new C15197e(c9457e), C12053e.f24142throw, C13325e.license);
    }

    public static final void yandex(InterfaceC2235e interfaceC2235e, long j, long j2, boolean z, Function1 function1) {
        C18478e mo782finally;
        long m4560try;
        float max = Math.max(Float.intBitsToFloat((int) (interfaceC2235e.yandex() >> 32)) / Float.intBitsToFloat((int) (j2 >> 32)), Float.intBitsToFloat((int) (interfaceC2235e.yandex() & 4294967295L)) / Float.intBitsToFloat((int) (j2 & 4294967295L)));
        float intBitsToFloat = Float.intBitsToFloat((int) (interfaceC2235e.yandex() >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (interfaceC2235e.yandex() & 4294967295L));
        C18478e mo782finally2 = interfaceC2235e.mo782finally();
        long m4560try2 = mo782finally2.m4560try();
        mo782finally2.m4557this().billing();
        try {
            C5389e c5389e = (C5389e) mo782finally2.f36228e;
            if (z) {
                c5389e.appmetrica(0.0f, 0.0f, intBitsToFloat, intBitsToFloat2, 1);
            }
            if ((((9187343241974906880L ^ (j & 9187343241974906880L)) - 4294967297L) & (-9223372034707292160L)) != 0 || C2152e.vip(j, 0L)) {
                mo782finally = interfaceC2235e.mo782finally();
                m4560try = mo782finally.m4560try();
                mo782finally.m4557this().billing();
                try {
                    ((C5389e) mo782finally.f36228e).firebase(max, max, 0L);
                    function1.invoke(interfaceC2235e);
                    AbstractC0054e.m224this(mo782finally2, m4560try2);
                } finally {
                }
            }
            float intBitsToFloat3 = Float.intBitsToFloat((int) (j >> 32));
            float intBitsToFloat4 = Float.intBitsToFloat((int) (j & 4294967295L));
            ((C5389e) interfaceC2235e.mo782finally().f36228e).m1898this(intBitsToFloat3, intBitsToFloat4);
            try {
                mo782finally = interfaceC2235e.mo782finally();
                m4560try = mo782finally.m4560try();
                mo782finally.m4557this().billing();
                try {
                    ((C5389e) mo782finally.f36228e).firebase(max, max, 0L);
                    function1.invoke(interfaceC2235e);
                    mo782finally.m4557this().admob();
                    mo782finally.m4533continue(m4560try);
                    AbstractC0054e.m224this(mo782finally2, m4560try2);
                } finally {
                }
            } finally {
                ((C5389e) interfaceC2235e.mo782finally().f36228e).m1898this(-intBitsToFloat3, -intBitsToFloat4);
            }
        } catch (Throwable th) {
            AbstractC0054e.m224this(mo782finally2, m4560try2);
            throw th;
        }
    }

    @Override // defpackage.InterfaceC14403e
    public int ad(int i) {
        int mopub = mopub(i);
        if (mopub == -1 || mopub(mopub) == -1) {
            return -1;
        }
        return mopub;
    }

    public abstract int adcel(String str, byte[] bArr, int i, int i2);

    public abstract int advert(int i, int i2, byte[] bArr);

    public abstract int amazon(int i);

    @Override // defpackage.InterfaceC14403e
    public int appmetrica(int i) {
        return amazon(i);
    }

    public abstract String billing(int i, int i2, byte[] bArr);

    @Override // defpackage.InterfaceC14403e
    public int metrica(int i) {
        int amazon = amazon(i);
        if (amazon == -1 || amazon(amazon) == -1) {
            return -1;
        }
        return amazon;
    }

    public abstract int mopub(int i);

    @Override // defpackage.InterfaceC14403e
    public int smaato(int i) {
        return mopub(i);
    }
}
