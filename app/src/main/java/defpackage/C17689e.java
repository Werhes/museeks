package defpackage;

import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُ٘ۦ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C17689e implements Function2 {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ Object f34671e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f34672e;

    public /* synthetic */ C17689e(int i, Object obj) {
        this.f34672e = i;
        this.f34671e = obj;
    }

    public /* synthetic */ C17689e(Object obj, int i, int i2) {
        this.f34672e = i2;
        this.f34671e = obj;
    }

    private final Object ad(Object obj, Object obj2) {
        InterfaceC1148e interfaceC1148e;
        C8574e c8574e = (C8574e) this.f34671e;
        Set set = (Set) obj;
        synchronized (c8574e.license) {
            try {
                if (((EnumC18411e) c8574e.tapsense.getValue()).compareTo(EnumC18411e.f36093e) >= 0) {
                    C12618e c12618e = c8574e.startapp;
                    if (set instanceof C5456e) {
                        C12618e c12618e2 = ((C5456e) set).f11727e;
                        Object[] objArr = c12618e2.vip;
                        long[] jArr = c12618e2.ad;
                        int length = jArr.length - 2;
                        if (length >= 0) {
                            int i = 0;
                            while (true) {
                                long j = jArr[i];
                                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                    int i2 = 8 - ((~(i - length)) >>> 31);
                                    for (int i3 = 0; i3 < i2; i3++) {
                                        if ((255 & j) < 128) {
                                            Object obj3 = objArr[(i << 3) + i3];
                                            if (!(obj3 instanceof AbstractC6329e) || ((AbstractC6329e) obj3).metrica(1)) {
                                                c12618e.ad(obj3);
                                            }
                                        }
                                        j >>= 8;
                                    }
                                    if (i2 != 8) {
                                        break;
                                    }
                                }
                                if (i == length) {
                                    break;
                                }
                                i++;
                            }
                        }
                    } else {
                        for (Object obj4 : set) {
                            if (!(obj4 instanceof AbstractC6329e) || ((AbstractC6329e) obj4).metrica(1)) {
                                c12618e.ad(obj4);
                            }
                        }
                    }
                    interfaceC1148e = c8574e.crashlytics();
                } else {
                    interfaceC1148e = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (interfaceC1148e != null) {
            ((C13578e) interfaceC1148e).billing(Unit.INSTANCE);
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x0139, code lost:
    
        if (r2 == null) goto L39;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0140  */
    @Override // kotlin.jvm.functions.Function2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invoke(java.lang.Object r57, java.lang.Object r58) {
        /*
            Method dump skipped, instructions count: 3178
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C17689e.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
    }
}
