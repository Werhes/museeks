package defpackage;

import j$.util.Objects;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eِٔٝ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC11750e {
    public static final C14099e ad = new C14099e(7);
    public static final C15217e vip = new C15217e(new C12575e(22));
    public static final C9981e metrica = new C9981e(5);
    public static final C7386e license = new C7386e(1);
    public static final C7386e appmetrica = new C7386e(2);
    public static final C7386e purchase = new C7386e(3);
    public static final C7386e billing = new C7386e(4);
    public static final C7386e yandex = new C7386e(5);
    public static final C7386e startapp = new C7386e(6);
    public static final C7386e adcel = new C7386e(7);
    public static final C7386e mopub = new C7386e(8);
    public static final C7386e advert = new C7386e(0);

    public static final C1295e ad(Function1 function1) {
        C3766e c3766e = new C3766e();
        function1.invoke(c3766e);
        float[] fArr = c3766e.vip;
        ArrayList arrayList = c3766e.ad;
        int size = arrayList.size();
        AbstractC1660e.signatures(size, fArr.length);
        return new C1295e(arrayList, Arrays.copyOfRange(fArr, 0, size));
    }

    public static InterfaceC12864e appmetrica(InterfaceC12864e interfaceC12864e, C14995e c14995e, EnumC17426e enumC17426e, boolean z, InterfaceC8642e interfaceC8642e) {
        return interfaceC12864e.premium(new C17219e(c14995e, enumC17426e, z, interfaceC8642e));
    }

    public static int billing() {
        ClassLoader classLoader = AbstractC11750e.class.getClassLoader();
        Objects.requireNonNull(classLoader);
        InputStream resourceAsStream = classLoader.getResourceAsStream("car-app-api.level");
        if (resourceAsStream == null) {
            throw new IllegalStateException("Car API level file car-app-api.level not found");
        }
        try {
            String readLine = new BufferedReader(new InputStreamReader(resourceAsStream)).readLine();
            int parseInt = Integer.parseInt(readLine);
            if (parseInt >= 1 && parseInt <= 8) {
                return parseInt;
            }
            throw new IllegalStateException("Unrecognized Car API level: " + readLine);
        } catch (IOException unused) {
            throw new IllegalStateException("Unable to read Car API level file");
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:1|(2:3|(7:5|6|7|(1:(1:10)(2:16|17))(4:18|19|20|(1:22))|11|12|13))|24|6|7|(0)(0)|11|12|13) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object metrica(kotlin.jvm.functions.Function0 r4, kotlin.jvm.functions.Function2 r5, defpackage.AbstractC10731e r6) {
        /*
            boolean r0 = r6 instanceof defpackage.C16892e
            if (r0 == 0) goto L13
            r0 = r6
            eٌٗۙ r0 = (defpackage.C16892e) r0
            int r1 = r0.f33106e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f33106e = r1
            goto L18
        L13:
            eٌٗۙ r0 = new eٌٗۙ
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f33107e
            int r1 = r0.f33106e
            r2 = 1
            if (r1 == 0) goto L2d
            if (r1 != r2) goto L25
            defpackage.AbstractC2003e.purchase(r6)     // Catch: defpackage.C13007e -> L42
            goto L42
        L25:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2d:
            defpackage.AbstractC2003e.purchase(r6)
            eٔٞۢ r6 = new eٔٞۢ     // Catch: defpackage.C13007e -> L42
            r1 = 0
            r3 = 2
            r6.<init>(r4, r5, r1, r3)     // Catch: defpackage.C13007e -> L42
            r0.f33106e = r2     // Catch: defpackage.C13007e -> L42
            java.lang.Object r4 = defpackage.AbstractC9743e.appmetrica(r6, r0)     // Catch: defpackage.C13007e -> L42
            eٟؔۙ r5 = defpackage.EnumC2821e.f6782e
            if (r4 != r5) goto L42
            return r5
        L42:
            kotlin.Unit r4 = kotlin.Unit.INSTANCE
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC11750e.metrica(kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function2, eُؑ۠):java.lang.Object");
    }

    public static C14607e purchase(long j, long j2, long j3, long j4, long j5, C13770e c13770e, int i, int i2) {
        long j6;
        long j7;
        long j8 = (i2 & 1) != 0 ? ((C3618e) ((C16423e) c13770e.adcel(AbstractC10809e.ad)).ad.getValue()).ad : j;
        C15492e c15492e = AbstractC10809e.ad;
        long j9 = ((C3618e) ((C16423e) c13770e.adcel(c15492e)).mopub.getValue()).ad;
        long j10 = ((C3618e) c13770e.adcel(AbstractC12256e.ad)).ad;
        if (((C16423e) c13770e.adcel(c15492e)).ad()) {
            AbstractC6532e.inmobi(j10);
        } else {
            AbstractC6532e.inmobi(j10);
        }
        long billing2 = AbstractC6532e.billing(C3618e.vip(0.38f, j9), ((C3618e) ((C16423e) c13770e.adcel(c15492e)).purchase.getValue()).ad);
        long j11 = (i2 & 4) != 0 ? ((C3618e) ((C16423e) c13770e.adcel(c15492e)).ad.getValue()).ad : j2;
        long vip2 = (i2 & 8) != 0 ? C3618e.vip(0.24f, j11) : j3;
        long vip3 = C3618e.vip(0.32f, ((C3618e) ((C16423e) c13770e.adcel(c15492e)).mopub.getValue()).ad);
        long vip4 = C3618e.vip(0.12f, vip3);
        if ((i2 & 64) != 0) {
            j6 = j8;
            j7 = C3618e.vip(0.54f, AbstractC10809e.ad(j11, c13770e));
        } else {
            j6 = j8;
            j7 = j4;
        }
        return new C14607e(j6, billing2, j11, vip2, vip3, vip4, j7, (i2 & 128) != 0 ? C3618e.vip(0.54f, j11) : j5, C3618e.vip(0.12f, j7), C3618e.vip(0.12f, vip4));
    }

    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, eٔۦْ] */
    public static final Object vip(C14995e c14995e, float f, C5624e c5624e, C1295e c1295e, Object obj, InterfaceC2869e interfaceC2869e, AbstractC7185e abstractC7185e) {
        Object vip2;
        float purchase2 = c1295e.purchase(obj);
        ?? obj2 = new Object();
        obj2.f29883e = Float.isNaN(((C2616e) c14995e.startapp).purchase()) ? 0.0f : ((C2616e) c14995e.startapp).purchase();
        if (!Float.isNaN(purchase2)) {
            float f2 = obj2.f29883e;
            if (f2 != purchase2 && (vip2 = AbstractC7844e.vip(f2, purchase2, f, interfaceC2869e, new C6949e(c5624e, (Object) obj2, 6), abstractC7185e)) == EnumC2821e.f6782e) {
                return vip2;
            }
        }
        return Unit.INSTANCE;
    }

    public static int yandex(AbstractC17080e abstractC17080e, String str, int i, int i2) {
        int inmobi = abstractC17080e.inmobi();
        if (inmobi >= i && inmobi <= i2) {
            return inmobi;
        }
        String loadAd = abstractC17080e.loadAd();
        StringBuilder smaato = AbstractC10257e.smaato("Expected ", str, " but was ", inmobi, " at path ");
        smaato.append(loadAd);
        throw new C14803e(smaato.toString(), 8, (byte) 0);
    }

    public abstract int license(int i, int i2, EnumC7792e enumC7792e);
}
