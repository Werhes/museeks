package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙِۡ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C12043e implements Function2 {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final /* synthetic */ Object f24069e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ float f24070e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ int f24071e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final /* synthetic */ Object f24072e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f24073e = 0;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final /* synthetic */ Object f24074e;

    public /* synthetic */ C12043e(int i, float f, C13621e c13621e, C15274e c15274e, C2616e c2616e) {
        this.f24071e = i;
        this.f24070e = f;
        this.f24072e = c13621e;
        this.f24069e = c15274e;
        this.f24074e = c2616e;
    }

    public /* synthetic */ C12043e(C8054e c8054e, int i, float f, C6260e c6260e, InterfaceC3965e interfaceC3965e) {
        this.f24072e = c8054e;
        this.f24071e = i;
        this.f24070e = f;
        this.f24069e = c6260e;
        this.f24074e = interfaceC3965e;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f24073e) {
            case 0:
                C13621e c13621e = (C13621e) this.f24072e;
                C15274e c15274e = (C15274e) this.f24069e;
                C2616e c2616e = (C2616e) this.f24074e;
                C13770e c13770e = (C13770e) obj;
                int intValue = ((Integer) obj2).intValue();
                if (c13770e.m3673protected(intValue & 1, (intValue & 3) != 2)) {
                    C3721e c3721e = new C3721e(0.0f, this.f24071e >= 1 ? r3 : 1);
                    C5015e c5015e = AbstractC0608e.ad;
                    C14607e purchase = AbstractC11750e.purchase(((C3618e) c13770e.adcel(c5015e)).ad, ((C3618e) c13770e.adcel(c5015e)).ad, C3618e.startapp, 0L, 0L, c13770e, 3072, 1010);
                    InterfaceC12864e metrica = AbstractC18007e.metrica(C0115e.f1276e, 1.0f);
                    boolean yandex = c13770e.yandex(c13621e);
                    Object m3681throw = c13770e.m3681throw();
                    C5170e c5170e = C2987e.ad;
                    if (yandex || m3681throw == c5170e) {
                        m3681throw = new C12439e(c13621e, c2616e, 0);
                        c13770e.m3682throws(m3681throw);
                    }
                    Function1 function1 = (Function1) m3681throw;
                    boolean yandex2 = c13770e.yandex(c13621e);
                    Object m3681throw2 = c13770e.m3681throw();
                    if (yandex2 || m3681throw2 == c5170e) {
                        m3681throw2 = new Celse(c13621e, c2616e, 1);
                        c13770e.m3682throws(m3681throw2);
                    }
                    AbstractC8741e.vip(this.f24070e, function1, metrica, false, c3721e, 0, (Function0) m3681throw2, c15274e, purchase, c13770e, 12583296, 40);
                } else {
                    c13770e.m3659default();
                }
                return Unit.INSTANCE;
            default:
                final C8054e c8054e = (C8054e) this.f24072e;
                final C6260e c6260e = (C6260e) this.f24069e;
                final InterfaceC3965e interfaceC3965e = (InterfaceC3965e) this.f24074e;
                C13770e c13770e2 = (C13770e) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if (c13770e2.m3673protected(intValue2 & 1, (intValue2 & 3) != 2)) {
                    EnumC5771e enumC5771e = (EnumC5771e) c8054e.f16359e.getValue();
                    int i = this.f24071e;
                    boolean license = c13770e2.license(i);
                    Object m3681throw3 = c13770e2.m3681throw();
                    if (license || m3681throw3 == C2987e.ad) {
                        m3681throw3 = new C17028e(i, 12);
                        c13770e2.m3682throws(m3681throw3);
                    }
                    Function1 function12 = (Function1) m3681throw3;
                    final float f = this.f24070e;
                    AbstractC7572e.vip(enumC5771e, null, function12, null, BuildConfig.FLAVOR, null, AbstractC16653e.license(-730911885, new Function4() { // from class: eؙؙۖ
                        /* JADX WARN: Code restructure failed: missing block: B:42:0x0344, code lost:
                        
                            if (r6 == r5) goto L46;
                         */
                        /* JADX WARN: Code restructure failed: missing block: B:46:0x03ba, code lost:
                        
                            if (r4 == r2) goto L53;
                         */
                        /* JADX WARN: Code restructure failed: missing block: B:52:0x0440, code lost:
                        
                            if (r12 == r9) goto L62;
                         */
                        /* JADX WARN: Code restructure failed: missing block: B:65:0x0560, code lost:
                        
                            if (r1 == r0) goto L81;
                         */
                        /* JADX WARN: Multi-variable type inference failed */
                        /* JADX WARN: Type inference failed for: r2v20 */
                        /* JADX WARN: Type inference failed for: r2v21, types: [int, boolean] */
                        /* JADX WARN: Type inference failed for: r2v33 */
                        @Override // kotlin.jvm.functions.Function4
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct add '--show-bad-code' argument
                        */
                        public final java.lang.Object invoke(java.lang.Object r53, java.lang.Object r54, java.lang.Object r55, java.lang.Object r56) {
                            /*
                                Method dump skipped, instructions count: 1512
                                To view this dump add '--comments-level debug' option
                            */
                            throw new UnsupportedOperationException("Method not decompiled: defpackage.C6243e.invoke(java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
                        }
                    }, c13770e2), c13770e2, 1597440, 42);
                } else {
                    c13770e2.m3659default();
                }
                return Unit.INSTANCE;
        }
    }
}
