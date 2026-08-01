package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَٓؓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10246e extends AbstractC7185e implements Function3 {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public List f20255e;

    /* renamed from: eٕؒۙ, reason: contains not printable characters */
    public int f20256e;

    /* renamed from: eٕؓۥ, reason: contains not printable characters */
    public C12618e f20257e;

    /* renamed from: eؙؔٞ, reason: contains not printable characters */
    public C12618e f20258e;

    /* renamed from: eَؕ۟, reason: contains not printable characters */
    public /* synthetic */ InterfaceC9089e f20259e;

    /* renamed from: eؚٕؒ, reason: contains not printable characters */
    public final /* synthetic */ C8574e f20260e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public C12618e f20261e;

    /* renamed from: eٍۗۛ, reason: contains not printable characters */
    public Set f20262e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public C12618e f20263e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public List f20264e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public List f20265e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10246e(C8574e c8574e, InterfaceC5083e interfaceC5083e) {
        super(3, interfaceC5083e);
        this.f20260e = c8574e;
    }

    public static final void signatures(List list, C8574e c8574e) {
        list.clear();
        synchronized (c8574e.license) {
            try {
                ArrayList arrayList = c8574e.advert;
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    list.add((AbstractC14546e) arrayList.get(i));
                }
                c8574e.advert.clear();
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static final void subscription(C8574e c8574e, List list, List list2, List list3, C12618e c12618e, C12618e c12618e2, C12618e c12618e3, C12618e c12618e4) {
        char c;
        long j;
        long j2;
        synchronized (c8574e.license) {
            try {
                list.clear();
                list2.clear();
                int size = list3.size();
                for (int i = 0; i < size; i++) {
                    C17489e c17489e = (C17489e) list3.get(i);
                    c17489e.vip();
                    c8574e.m2445default(c17489e);
                }
                list3.clear();
                Object[] objArr = c12618e.vip;
                long[] jArr = c12618e.ad;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i2 = 0;
                    j = 255;
                    while (true) {
                        long j3 = jArr[i2];
                        c = 7;
                        j2 = -9187201950435737472L;
                        if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i3 = 8 - ((~(i2 - length)) >>> 31);
                            for (int i4 = 0; i4 < i3; i4++) {
                                if ((j3 & 255) < 128) {
                                    C17489e c17489e2 = (C17489e) objArr[(i2 << 3) + i4];
                                    c17489e2.vip();
                                    c8574e.m2445default(c17489e2);
                                }
                                j3 >>= 8;
                            }
                            if (i3 != 8) {
                                break;
                            }
                        }
                        if (i2 == length) {
                            break;
                        } else {
                            i2++;
                        }
                    }
                } else {
                    c = 7;
                    j = 255;
                    j2 = -9187201950435737472L;
                }
                c12618e.vip();
                Object[] objArr2 = c12618e2.vip;
                long[] jArr2 = c12618e2.ad;
                int length2 = jArr2.length - 2;
                if (length2 >= 0) {
                    int i5 = 0;
                    while (true) {
                        long j4 = jArr2[i5];
                        if ((((~j4) << c) & j4 & j2) != j2) {
                            int i6 = 8 - ((~(i5 - length2)) >>> 31);
                            for (int i7 = 0; i7 < i6; i7++) {
                                if ((j4 & j) < 128) {
                                    ((C17489e) objArr2[(i5 << 3) + i7]).yandex();
                                }
                                j4 >>= 8;
                            }
                            if (i6 != 8) {
                                break;
                            }
                        }
                        if (i5 == length2) {
                            break;
                        } else {
                            i5++;
                        }
                    }
                }
                c12618e2.vip();
                c12618e3.vip();
                Object[] objArr3 = c12618e4.vip;
                long[] jArr3 = c12618e4.ad;
                int length3 = jArr3.length - 2;
                if (length3 >= 0) {
                    int i8 = 0;
                    while (true) {
                        long j5 = jArr3[i8];
                        if ((((~j5) << c) & j5 & j2) != j2) {
                            int i9 = 8 - ((~(i8 - length3)) >>> 31);
                            for (int i10 = 0; i10 < i9; i10++) {
                                if ((j5 & j) < 128) {
                                    C17489e c17489e3 = (C17489e) objArr3[(i8 << 3) + i10];
                                    c17489e3.vip();
                                    c8574e.m2445default(c17489e3);
                                }
                                j5 >>= 8;
                            }
                            if (i9 != 8) {
                                break;
                            }
                        }
                        if (i8 == length3) {
                            break;
                        } else {
                            i8++;
                        }
                    }
                }
                c12618e4.vip();
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        C10246e c10246e = new C10246e(this.f20260e, (InterfaceC5083e) obj3);
        c10246e.f20259e = (InterfaceC9089e) obj2;
        c10246e.loadAd(Unit.INSTANCE);
        return EnumC2821e.f6782e;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0099 A[DONT_GENERATE] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x00ef -> B:6:0x00f7). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0118 -> B:7:0x0094). Please report as a decompilation issue!!! */
    @Override // defpackage.AbstractC9049e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object loadAd(java.lang.Object r18) {
        /*
            Method dump skipped, instructions count: 290
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C10246e.loadAd(java.lang.Object):java.lang.Object");
    }
}
