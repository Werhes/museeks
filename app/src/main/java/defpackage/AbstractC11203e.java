package defpackage;

import android.os.Build;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُۗۚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC11203e {
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0052, code lost:
    
        if (r2 == null) goto L48;
     */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0058 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.C14830e ad(byte[] r7) {
        /*
            eٜٔؕ r0 = new eٜٔؕ
            r0.<init>()
            if (r7 != 0) goto L8
            goto L55
        L8:
            java.io.ByteArrayInputStream r1 = new java.io.ByteArrayInputStream
            r1.<init>(r7)
            r7 = 0
            java.io.ObjectInputStream r2 = new java.io.ObjectInputStream     // Catch: java.lang.Throwable -> L47 java.io.IOException -> L4b
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L47 java.io.IOException -> L4b
            int r7 = r2.readInt()     // Catch: java.lang.Throwable -> L32 java.io.IOException -> L34
        L17:
            if (r7 <= 0) goto L36
            java.lang.String r3 = r2.readUTF()     // Catch: java.lang.Throwable -> L32 java.io.IOException -> L34
            android.net.Uri r3 = android.net.Uri.parse(r3)     // Catch: java.lang.Throwable -> L32 java.io.IOException -> L34
            boolean r4 = r2.readBoolean()     // Catch: java.lang.Throwable -> L32 java.io.IOException -> L34
            eٌٝۜ r5 = new eٌٝۜ     // Catch: java.lang.Throwable -> L32 java.io.IOException -> L34
            r5.<init>(r4, r3)     // Catch: java.lang.Throwable -> L32 java.io.IOException -> L34
            java.util.HashSet r3 = r0.ad     // Catch: java.lang.Throwable -> L32 java.io.IOException -> L34
            r3.add(r5)     // Catch: java.lang.Throwable -> L32 java.io.IOException -> L34
            int r7 = r7 + (-1)
            goto L17
        L32:
            r7 = move-exception
            goto L56
        L34:
            r7 = move-exception
            goto L4f
        L36:
            r2.close()     // Catch: java.io.IOException -> L3a
            goto L3e
        L3a:
            r7 = move-exception
            r7.printStackTrace()
        L3e:
            r1.close()     // Catch: java.io.IOException -> L42
            goto L55
        L42:
            r7 = move-exception
            r7.printStackTrace()
            goto L55
        L47:
            r0 = move-exception
            r2 = r7
            r7 = r0
            goto L56
        L4b:
            r2 = move-exception
            r6 = r2
            r2 = r7
            r7 = r6
        L4f:
            r7.printStackTrace()     // Catch: java.lang.Throwable -> L32
            if (r2 == 0) goto L3e
            goto L36
        L55:
            return r0
        L56:
            if (r2 == 0) goto L60
            r2.close()     // Catch: java.io.IOException -> L5c
            goto L60
        L5c:
            r0 = move-exception
            r0.printStackTrace()
        L60:
            r1.close()     // Catch: java.io.IOException -> L64
            goto L68
        L64:
            r0 = move-exception
            r0.printStackTrace()
        L68:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC11203e.ad(byte[]):eٜٔؕ");
    }

    public static final Object adcel(AbstractC0003e abstractC0003e, EnumC7785e enumC7785e, Function2 function2, AbstractC7185e abstractC7185e) {
        Object appmetrica;
        if (enumC7785e != EnumC7785e.f15778e) {
            return (((C4891e) abstractC0003e).license != EnumC7785e.f15780e && (appmetrica = AbstractC9743e.appmetrica(new C1247e(abstractC0003e, enumC7785e, function2, (InterfaceC5083e) null), abstractC7185e)) == EnumC2821e.f6782e) ? appmetrica : Unit.INSTANCE;
        }
        throw new IllegalArgumentException("repeatOnLifecycle cannot start work with the INITIALIZED lifecycle state.");
    }

    public static int appmetrica(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 2;
        }
        throw new IllegalArgumentException(AbstractC1634e.smaato("Could not convert ", i, " to BackoffPolicy"));
    }

    public static int billing(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 2;
        }
        throw new IllegalArgumentException(AbstractC1634e.smaato("Could not convert ", i, " to OutOfQuotaPolicy"));
    }

    public static String license(int i, int[] iArr, String[] strArr, int[] iArr2) {
        StringBuilder sb = new StringBuilder("$");
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = iArr[i2];
            if (i3 == 1 || i3 == 2) {
                sb.append('[');
                sb.append(iArr2[i2]);
                sb.append(']');
            } else if (i3 == 3 || i3 == 4 || i3 == 5) {
                sb.append('.');
                String str = strArr[i2];
                if (str != null) {
                    sb.append(str);
                }
            }
        }
        return sb.toString();
    }

    public static final Object metrica(InterfaceC16719e interfaceC16719e) {
        Object signatures = interfaceC16719e.signatures();
        C2365e c2365e = signatures instanceof C2365e ? (C2365e) signatures : null;
        if (c2365e != null) {
            return c2365e.f5926e;
        }
        return null;
    }

    public static int mopub(EnumC7300e enumC7300e) {
        int ordinal = enumC7300e.ordinal();
        if (ordinal == 0) {
            return 0;
        }
        int i = 1;
        if (ordinal != 1) {
            i = 2;
            if (ordinal != 2) {
                i = 3;
                if (ordinal != 3) {
                    i = 4;
                    if (ordinal != 4) {
                        if (ordinal == 5) {
                            return 5;
                        }
                        throw new IllegalArgumentException("Could not convert " + enumC7300e + " to int");
                    }
                }
            }
        }
        return i;
    }

    public static int purchase(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 2;
        }
        if (i == 2) {
            return 3;
        }
        if (i == 3) {
            return 4;
        }
        if (i == 4) {
            return 5;
        }
        if (Build.VERSION.SDK_INT < 30 || i != 5) {
            throw new IllegalArgumentException(AbstractC1634e.smaato("Could not convert ", i, " to NetworkType"));
        }
        return 6;
    }

    public static final InterfaceC12864e startapp(InterfaceC12864e interfaceC12864e, String str) {
        return interfaceC12864e.premium(new C14705e(str));
    }

    public static final void vip(long j, EnumC17426e enumC17426e) {
        if (enumC17426e == EnumC17426e.f34146e) {
            if (C5602e.billing(j) != Integer.MAX_VALUE) {
                return;
            }
            AbstractC8889e.metrica("Vertically scrollable component was measured with an infinity maximum height constraints, which is disallowed. One of the common reasons is nesting layouts like LazyColumn and Column(Modifier.verticalScroll()). If you want to add a header before the list of items please add a header as a separate item() before the main items() inside the LazyColumn scope. There could be other reasons for this to happen: your ComposeView was added into a LinearLayout with some weight, you applied Modifier.wrapContentSize(unbounded = true) or wrote a custom layout. Please try to remove the source of infinite constraints in the hierarchy above the scrolling container.");
        } else {
            if (C5602e.yandex(j) != Integer.MAX_VALUE) {
                return;
            }
            AbstractC8889e.metrica("Horizontally scrollable component was measured with an infinity maximum width constraints, which is disallowed. One of the common reasons is nesting layouts like LazyRow and Row(Modifier.horizontalScroll()). If you want to add a header before the list of items please add a header as a separate item() before the main items() inside the LazyRow scope. There could be other reasons for this to happen: your ComposeView was added into a LinearLayout with some weight, you applied Modifier.wrapContentSize(unbounded = true) or wrote a custom layout. Please try to remove the source of infinite constraints in the hierarchy above the scrolling container.");
        }
    }

    public static EnumC7300e yandex(int i) {
        if (i == 0) {
            return EnumC7300e.f14903e;
        }
        if (i == 1) {
            return EnumC7300e.f14901e;
        }
        if (i == 2) {
            return EnumC7300e.f14900e;
        }
        if (i == 3) {
            return EnumC7300e.f14902e;
        }
        if (i == 4) {
            return EnumC7300e.f14899e;
        }
        if (i == 5) {
            return EnumC7300e.f14905e;
        }
        throw new IllegalArgumentException(AbstractC1634e.smaato("Could not convert ", i, " to State"));
    }
}
