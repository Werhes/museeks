package defpackage;

import android.graphics.BlurMaskFilter;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙٝۨ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC6537e {
    public static final C2892e ad = new C2892e(-1554654270, false, new C15480e(10));

    public static final BlurMaskFilter ad(float f) {
        return new BlurMaskFilter(f, BlurMaskFilter.Blur.NORMAL);
    }

    public static int appmetrica(int i, int i2, byte[] bArr) {
        byte b = bArr[i - 1];
        int i3 = i2 - i;
        if (i3 == 0) {
            if (b > -12) {
                return -1;
            }
            return b;
        }
        if (i3 == 1) {
            return license(b, bArr[i]);
        }
        if (i3 != 2) {
            throw new AssertionError();
        }
        byte b2 = bArr[i];
        byte b3 = bArr[i + 1];
        if (b > -12 || b2 > -65 || b3 > -65) {
            return -1;
        }
        return (b3 << 16) ^ ((b2 << 8) ^ b);
    }

    public static boolean billing(int i, int i2, int i3, int i4) {
        return (i3 == 1 || i3 == 2 || (i3 == 4 && i != 2)) || (i4 == 1 || i4 == 2 || (i4 == 4 && i2 != 2));
    }

    public static int license(int i, int i2) {
        if (i > -12 || i2 > -65) {
            return -1;
        }
        return i ^ (i2 << 8);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [eؙۗ, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r10v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v5, types: [eؙۗ, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r10v7 */
    public static C18310e metrica(C11325e c11325e, int i, ArrayList arrayList, C18310e c18310e) {
        int i2;
        int i3 = i == 0 ? c11325e.f22740for : c11325e.f22734continue;
        if (i3 != -1 && (c18310e == 0 || i3 != c18310e.vip)) {
            int i4 = 0;
            while (true) {
                if (i4 >= arrayList.size()) {
                    break;
                }
                C18310e c18310e2 = (C18310e) arrayList.get(i4);
                if (c18310e2.vip == i3) {
                    if (c18310e != 0) {
                        c18310e.metrica(i, c18310e2);
                        arrayList.remove((Object) c18310e);
                    }
                    c18310e = c18310e2;
                } else {
                    i4++;
                }
            }
        } else if (i3 != -1) {
            return c18310e;
        }
        C18310e c18310e3 = c18310e;
        if (c18310e == 0) {
            if (c11325e instanceof AbstractC14215e) {
                AbstractC14215e abstractC14215e = (AbstractC14215e) c11325e;
                int i5 = 0;
                while (true) {
                    if (i5 >= abstractC14215e.f28080e) {
                        i2 = -1;
                        break;
                    }
                    C11325e c11325e2 = abstractC14215e.f28081e[i5];
                    if ((i == 0 && (i2 = c11325e2.f22740for) != -1) || (i == 1 && (i2 = c11325e2.f22734continue) != -1)) {
                        break;
                    }
                    i5++;
                }
                if (i2 != -1) {
                    int i6 = 0;
                    while (true) {
                        if (i6 >= arrayList.size()) {
                            break;
                        }
                        C18310e c18310e4 = (C18310e) arrayList.get(i6);
                        if (c18310e4.vip == i2) {
                            c18310e = c18310e4;
                            break;
                        }
                        i6++;
                    }
                }
            }
            if (c18310e == 0) {
                c18310e = new Object();
                c18310e.ad = new ArrayList();
                c18310e.license = null;
                c18310e.appmetrica = -1;
                int i7 = C18310e.purchase;
                C18310e.purchase = i7 + 1;
                c18310e.vip = i7;
                c18310e.metrica = i;
            }
            arrayList.add(c18310e);
            c18310e3 = c18310e;
        }
        int i8 = c18310e3.vip;
        ArrayList arrayList2 = c18310e3.ad;
        if (arrayList2.contains(c11325e)) {
            return c18310e3;
        }
        arrayList2.add(c11325e);
        if (c11325e instanceof C0913e) {
            C0913e c0913e = (C0913e) c11325e;
            c0913e.f3336e.metrica(c0913e.f3335e == 0 ? 1 : 0, c18310e3, arrayList);
        }
        if (i == 0) {
            c11325e.f22740for = i8;
            c11325e.f22758this.metrica(i, c18310e3, arrayList);
            c11325e.f22737extends.metrica(i, c18310e3, arrayList);
        } else {
            c11325e.f22734continue = i8;
            c11325e.f22746native.metrica(i, c18310e3, arrayList);
            c11325e.f22764while.metrica(i, c18310e3, arrayList);
            c11325e.f22759throw.metrica(i, c18310e3, arrayList);
        }
        c11325e.f22729break.metrica(i, c18310e3, arrayList);
        return c18310e3;
    }

    public static int purchase(int i, int i2, byte[] bArr) {
        while (i < i2 && bArr[i] >= 0) {
            i++;
        }
        if (i >= i2) {
            return 0;
        }
        while (i < i2) {
            int i3 = i + 1;
            byte b = bArr[i];
            if (b >= 0) {
                i = i3;
            } else if (b < -32) {
                if (i3 >= i2) {
                    return b;
                }
                if (b < -62) {
                    return -1;
                }
                i += 2;
                if (bArr[i3] > -65) {
                    return -1;
                }
            } else if (b < -16) {
                if (i3 >= i2 - 1) {
                    return appmetrica(i3, i2, bArr);
                }
                int i4 = i + 2;
                byte b2 = bArr[i3];
                if (b2 > -65) {
                    return -1;
                }
                if (b == -32 && b2 < -96) {
                    return -1;
                }
                if (b == -19 && b2 >= -96) {
                    return -1;
                }
                i += 3;
                if (bArr[i4] > -65) {
                    return -1;
                }
            } else {
                if (i3 >= i2 - 2) {
                    return appmetrica(i3, i2, bArr);
                }
                int i5 = i + 2;
                byte b3 = bArr[i3];
                if (b3 > -65) {
                    return -1;
                }
                if ((((b3 + 112) + (b << 28)) >> 30) != 0) {
                    return -1;
                }
                int i6 = i + 3;
                if (bArr[i5] > -65) {
                    return -1;
                }
                i += 4;
                if (bArr[i6] > -65) {
                    return -1;
                }
            }
        }
        return 0;
    }

    public static C0370e vip(List list, Map map, boolean z) {
        ArrayList arrayList = new ArrayList(list);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            Object obj = (AbstractC16049e) entry.getValue();
            if ((obj instanceof InterfaceC14776e) && ((InterfaceC14776e) obj).ad()) {
                arrayList.remove(str);
                Unit unit = Unit.INSTANCE;
            } else {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return new C0370e(linkedHashMap, arrayList, z);
    }
}
