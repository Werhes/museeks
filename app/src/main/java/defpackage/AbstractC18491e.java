package defpackage;

import android.content.Context;
import android.graphics.Path;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eۦؕ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC18491e {
    public static final C2892e ad = new C2892e(307633258, false, new C2131e(19));
    public static final C2892e vip = new C2892e(1548817674, false, new C2131e(20));
    public static final C2892e metrica = new C2892e(1583103019, false, new C13428e(2));
    public static final C2892e license = new C2892e(-2091979339, false, new C2131e(21));

    /* JADX WARN: Multi-variable type inference failed */
    public static void adcel(C13773e[] c13773eArr, Path path) {
        int i;
        float[] fArr;
        int i2;
        C13773e c13773e;
        int i3;
        char c;
        float f;
        float f2;
        C13773e c13773e2;
        boolean z;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        float f8;
        float f9;
        float f10;
        C13773e[] c13773eArr2 = c13773eArr;
        Path path2 = path;
        float[] fArr2 = new float[6];
        int length = c13773eArr2.length;
        int i4 = 0;
        int i5 = 0;
        char c2 = 'm';
        while (i5 < length) {
            C13773e c13773e3 = c13773eArr2[i5];
            char c3 = c13773e3.ad;
            float[] fArr3 = c13773e3.vip;
            float f11 = fArr2[i4];
            float f12 = fArr2[1];
            float f13 = fArr2[2];
            float f14 = fArr2[3];
            float f15 = fArr2[4];
            int i6 = i4;
            float f16 = fArr2[5];
            switch (c3) {
                case 'A':
                case 'a':
                    i = 7;
                    break;
                case 'C':
                case 'c':
                    i = 6;
                    break;
                case 'H':
                case 'V':
                case 'h':
                case 'v':
                    i = 1;
                    break;
                case 'Q':
                case 'S':
                case 'q':
                case 's':
                    i = 4;
                    break;
                case 'Z':
                case 'z':
                    path2.close();
                    path2.moveTo(f15, f16);
                    f11 = f15;
                    f13 = f11;
                    f12 = f16;
                    f14 = f12;
                    break;
            }
            i = 2;
            float f17 = f15;
            float f18 = f16;
            float f19 = f11;
            float f20 = f12;
            int i7 = i6;
            while (i7 < fArr3.length) {
                if (c3 == 'A') {
                    fArr = fArr3;
                    i2 = i7;
                    c13773e = c13773e3;
                    float f21 = f19;
                    float f22 = f20;
                    i3 = i5;
                    c = c3;
                    int i8 = i2 + 5;
                    int i9 = i2 + 6;
                    C13773e.ad(path, f21, f22, fArr[i8], fArr[i9], fArr[i2], fArr[i2 + 1], fArr[i2 + 2], fArr[i2 + 3] != 0.0f ? 1 : i6, fArr[i2 + 4] != 0.0f ? 1 : i6);
                    f13 = fArr[i8];
                    f = fArr[i9];
                    f14 = f;
                    f2 = f13;
                } else if (c3 == 'C') {
                    fArr = fArr3;
                    i2 = i7;
                    i3 = i5;
                    c13773e = c13773e3;
                    c = c3;
                    int i10 = i2 + 2;
                    int i11 = i2 + 3;
                    int i12 = i2 + 4;
                    int i13 = i2 + 5;
                    path2.cubicTo(fArr[i2], fArr[i2 + 1], fArr[i10], fArr[i11], fArr[i12], fArr[i13]);
                    float f23 = fArr[i12];
                    float f24 = fArr[i13];
                    f13 = fArr[i10];
                    f14 = fArr[i11];
                    f = f24;
                    f2 = f23;
                } else if (c3 == 'H') {
                    fArr = fArr3;
                    i2 = i7;
                    c13773e = c13773e3;
                    c = c3;
                    f = f20;
                    i3 = i5;
                    path2.lineTo(fArr[i2], f);
                    f2 = fArr[i2];
                } else if (c3 == 'Q') {
                    fArr = fArr3;
                    i2 = i7;
                    i3 = i5;
                    c13773e = c13773e3;
                    c = c3;
                    int i14 = i2 + 1;
                    int i15 = i2 + 2;
                    int i16 = i2 + 3;
                    path2.quadTo(fArr[i2], fArr[i14], fArr[i15], fArr[i16]);
                    float f25 = fArr[i2];
                    float f26 = fArr[i14];
                    float f27 = fArr[i15];
                    float f28 = fArr[i16];
                    f13 = f25;
                    f14 = f26;
                    f2 = f27;
                    f = f28;
                } else if (c3 == 'V') {
                    fArr = fArr3;
                    i2 = i7;
                    i3 = i5;
                    c13773e = c13773e3;
                    f2 = f19;
                    c = c3;
                    path2.lineTo(f2, fArr[i2]);
                    f = fArr[i2];
                } else if (c3 != 'a') {
                    if (c3 == 'c') {
                        fArr = fArr3;
                        i2 = i7;
                        int i17 = i2 + 2;
                        int i18 = i2 + 3;
                        int i19 = i2 + 4;
                        int i20 = i2 + 5;
                        path2.rCubicTo(fArr[i2], fArr[i2 + 1], fArr[i17], fArr[i18], fArr[i19], fArr[i20]);
                        float f29 = fArr[i17] + f19;
                        float f30 = fArr[i18] + f20;
                        f19 += fArr[i19];
                        f20 += fArr[i20];
                        f13 = f29;
                        f14 = f30;
                    } else if (c3 != 'h') {
                        if (c3 != 'q') {
                            if (c3 != 'v') {
                                if (c3 == 'L') {
                                    fArr = fArr3;
                                    i2 = i7;
                                    int i21 = i2 + 1;
                                    path2.lineTo(fArr[i2], fArr[i21]);
                                    f2 = fArr[i2];
                                    f = fArr[i21];
                                } else if (c3 == 'M') {
                                    fArr = fArr3;
                                    i2 = i7;
                                    f2 = fArr[i2];
                                    f = fArr[i2 + 1];
                                    if (i2 > 0) {
                                        path2.lineTo(f2, f);
                                    } else {
                                        path2.moveTo(f2, f);
                                        f17 = f2;
                                        f18 = f;
                                    }
                                } else if (c3 != 'S') {
                                    if (c3 == 'T') {
                                        fArr = fArr3;
                                        i2 = i7;
                                        if (c2 == 'q' || c2 == 't' || c2 == 'Q' || c2 == 'T') {
                                            f19 = (f19 * 2.0f) - f13;
                                            f20 = (f20 * 2.0f) - f14;
                                        }
                                        int i22 = i2 + 1;
                                        path2.quadTo(f19, f20, fArr[i2], fArr[i22]);
                                        f2 = fArr[i2];
                                        f = fArr[i22];
                                        c13773e = c13773e3;
                                        f13 = f19;
                                        f14 = f20;
                                    } else if (c3 == 'l') {
                                        fArr = fArr3;
                                        i2 = i7;
                                        int i23 = i2 + 1;
                                        path2.rLineTo(fArr[i2], fArr[i23]);
                                        f19 += fArr[i2];
                                        f6 = fArr[i23];
                                    } else if (c3 == 'm') {
                                        fArr = fArr3;
                                        i2 = i7;
                                        float f31 = fArr[i2];
                                        f19 += f31;
                                        float f32 = fArr[i2 + 1];
                                        f20 += f32;
                                        if (i2 > 0) {
                                            path2.rLineTo(f31, f32);
                                        } else {
                                            path2.rMoveTo(f31, f32);
                                            c13773e = c13773e3;
                                            f2 = f19;
                                            f17 = f2;
                                            f = f20;
                                            f18 = f;
                                        }
                                    } else if (c3 != 's') {
                                        if (c3 != 't') {
                                            fArr = fArr3;
                                            i2 = i7;
                                            c13773e = c13773e3;
                                            f2 = f19;
                                        } else {
                                            if (c2 == 'q' || c2 == 't' || c2 == 'Q' || c2 == 'T') {
                                                f9 = f19 - f13;
                                                f10 = f20 - f14;
                                            } else {
                                                f10 = 0.0f;
                                                f9 = 0.0f;
                                            }
                                            int i24 = i7 + 1;
                                            path2.rQuadTo(f9, f10, fArr3[i7], fArr3[i24]);
                                            float f33 = f9 + f19;
                                            float f34 = f10 + f20;
                                            float f35 = f19 + fArr3[i7];
                                            f20 += fArr3[i24];
                                            f14 = f34;
                                            fArr = fArr3;
                                            i2 = i7;
                                            c13773e = c13773e3;
                                            f2 = f35;
                                            f13 = f33;
                                        }
                                        f = f20;
                                    } else {
                                        if (c2 == 'c' || c2 == 's' || c2 == 'C' || c2 == 'S') {
                                            f7 = f20 - f14;
                                            f8 = f19 - f13;
                                        } else {
                                            f8 = 0.0f;
                                            f7 = 0.0f;
                                        }
                                        int i25 = i7;
                                        int i26 = i25 + 1;
                                        int i27 = i25 + 2;
                                        int i28 = i25 + 3;
                                        fArr = fArr3;
                                        i2 = i25;
                                        path2.rCubicTo(f8, f7, fArr3[i25], fArr3[i26], fArr3[i27], fArr3[i28]);
                                        f3 = fArr[i2] + f19;
                                        f4 = fArr[i26] + f20;
                                        f19 += fArr[i27];
                                        f5 = fArr[i28];
                                    }
                                    i3 = i5;
                                    c = c3;
                                } else {
                                    fArr = fArr3;
                                    i2 = i7;
                                    if (c2 == 'c' || c2 == 's' || c2 == 'C' || c2 == 'S') {
                                        f19 = (f19 * 2.0f) - f13;
                                        f20 = (f20 * 2.0f) - f14;
                                    }
                                    float f36 = f19;
                                    float f37 = f20;
                                    int i29 = i2 + 1;
                                    int i30 = i2 + 2;
                                    int i31 = i2 + 3;
                                    path2.cubicTo(f36, f37, fArr[i2], fArr[i29], fArr[i30], fArr[i31]);
                                    f13 = fArr[i2];
                                    f14 = fArr[i29];
                                    f2 = fArr[i30];
                                    f = fArr[i31];
                                }
                                i3 = i5;
                                c13773e = c13773e3;
                                c = c3;
                            } else {
                                fArr = fArr3;
                                i2 = i7;
                                path2.rLineTo(0.0f, fArr[i2]);
                                f6 = fArr[i2];
                            }
                            f20 += f6;
                        } else {
                            fArr = fArr3;
                            i2 = i7;
                            int i32 = i2 + 1;
                            int i33 = i2 + 2;
                            int i34 = i2 + 3;
                            path2.rQuadTo(fArr[i2], fArr[i32], fArr[i33], fArr[i34]);
                            f3 = fArr[i2] + f19;
                            f4 = fArr[i32] + f20;
                            f19 += fArr[i33];
                            f5 = fArr[i34];
                        }
                        f20 += f5;
                        f13 = f3;
                        f14 = f4;
                    } else {
                        fArr = fArr3;
                        i2 = i7;
                        path2.rLineTo(fArr[i2], 0.0f);
                        f19 += fArr[i2];
                    }
                    c13773e = c13773e3;
                    f2 = f19;
                    f = f20;
                    i3 = i5;
                    c = c3;
                } else {
                    fArr = fArr3;
                    i2 = i7;
                    int i35 = i2 + 5;
                    float f38 = fArr[i35] + f19;
                    int i36 = i2 + 6;
                    float f39 = fArr[i36] + f20;
                    float f40 = fArr[i2];
                    float f41 = fArr[i2 + 1];
                    float f42 = fArr[i2 + 2];
                    if (fArr[i2 + 3] != 0.0f) {
                        c13773e2 = c13773e3;
                        z = 1;
                    } else {
                        c13773e2 = c13773e3;
                        z = i6;
                    }
                    c13773e = c13773e2;
                    float f43 = f19;
                    c = c3;
                    float f44 = f20;
                    i3 = i5;
                    C13773e.ad(path, f43, f44, f38, f39, f40, f41, f42, z, fArr[i2 + 4] != 0.0f ? 1 : i6);
                    f2 = f43 + fArr[i35];
                    f = f44 + fArr[i36];
                    f13 = f2;
                    f14 = f;
                }
                i7 = i2 + i;
                path2 = path;
                c13773e3 = c13773e;
                c3 = c;
                i5 = i3;
                f19 = f2;
                f20 = f;
                c2 = c3;
                fArr3 = fArr;
            }
            fArr2[i6] = f19;
            fArr2[1] = f20;
            fArr2[2] = f13;
            fArr2[3] = f14;
            fArr2[4] = f17;
            fArr2[5] = f18;
            c2 = c13773e3.ad;
            i5++;
            c13773eArr2 = c13773eArr;
            path2 = path;
            i4 = i6;
        }
    }

    public static final Object amazon(C1613e c1613e, boolean z, C1613e c1613e2, Function2 function2) {
        Object c1427e;
        Object m2176instanceof;
        try {
            if (function2 instanceof AbstractC9049e) {
                AbstractC9476e.purchase(2, function2);
                c1427e = function2.invoke(c1613e2, c1613e);
            } else {
                c1427e = AbstractC10558e.mopub(function2, c1613e2, c1613e);
            }
        } catch (C15295e e) {
            Throwable th = e.f30221e;
            c1613e.m2175import(new C1427e(th, false));
            throw th;
        } catch (Throwable th2) {
            c1427e = new C1427e(th2, false);
        }
        EnumC2821e enumC2821e = EnumC2821e.f6782e;
        if (c1427e == enumC2821e || (m2176instanceof = c1613e.m2176instanceof(c1427e)) == AbstractC15211e.vip) {
            return enumC2821e;
        }
        c1613e.mo654e();
        if (!(m2176instanceof instanceof C1427e)) {
            return AbstractC15211e.startapp(m2176instanceof);
        }
        if (!z) {
            Throwable th3 = ((C1427e) m2176instanceof).ad;
            if ((th3 instanceof C3063e) && ((C3063e) th3).f7127e == c1613e) {
                if (c1427e instanceof C1427e) {
                    throw ((C1427e) c1427e).ad;
                }
                return c1427e;
            }
        }
        throw ((C1427e) m2176instanceof).ad;
    }

    public static Path appmetrica(String str) {
        Path path = new Path();
        try {
            adcel(license(str), path);
            return path;
        } catch (RuntimeException e) {
            throw new RuntimeException("Error in parsing ".concat(str), e);
        }
    }

    public static C13773e[] billing(C13773e[] c13773eArr) {
        C13773e[] c13773eArr2 = new C13773e[c13773eArr.length];
        for (int i = 0; i < c13773eArr.length; i++) {
            c13773eArr2[i] = new C13773e(c13773eArr[i]);
        }
        return c13773eArr2;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:31:0x007a. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0096 A[Catch: NumberFormatException -> 0x00aa, LOOP:3: B:25:0x0068->B:35:0x0096, LOOP_END, TryCatch #0 {NumberFormatException -> 0x00aa, blocks: (B:22:0x0054, B:25:0x0068, B:27:0x006e, B:31:0x007a, B:35:0x0096, B:39:0x009c, B:44:0x00b1, B:56:0x00b4), top: B:21:0x0054 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0095 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x009c A[Catch: NumberFormatException -> 0x00aa, TryCatch #0 {NumberFormatException -> 0x00aa, blocks: (B:22:0x0054, B:25:0x0068, B:27:0x006e, B:31:0x007a, B:35:0x0096, B:39:0x009c, B:44:0x00b1, B:56:0x00b4), top: B:21:0x0054 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00b1 A[Catch: NumberFormatException -> 0x00aa, TryCatch #0 {NumberFormatException -> 0x00aa, blocks: (B:22:0x0054, B:25:0x0068, B:27:0x006e, B:31:0x007a, B:35:0x0096, B:39:0x009c, B:44:0x00b1, B:56:0x00b4), top: B:21:0x0054 }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00d7 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.C13773e[] license(java.lang.String r17) {
        /*
            Method dump skipped, instructions count: 268
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC18491e.license(java.lang.String):eؙٓؖ[]");
    }

    public static float[] metrica(float[] fArr, int i) {
        if (i < 0) {
            throw new IllegalArgumentException();
        }
        int length = fArr.length;
        if (length < 0) {
            throw new ArrayIndexOutOfBoundsException();
        }
        int min = Math.min(i, length);
        float[] fArr2 = new float[i];
        System.arraycopy(fArr, 0, fArr2, 0, min);
        return fArr2;
    }

    public static boolean vip(C13773e[] c13773eArr, C13773e[] c13773eArr2) {
        if (c13773eArr == null || c13773eArr2 == null || c13773eArr.length != c13773eArr2.length) {
            return false;
        }
        for (int i = 0; i < c13773eArr.length; i++) {
            C13773e c13773e = c13773eArr[i];
            char c = c13773e.ad;
            C13773e c13773e2 = c13773eArr2[i];
            if (c != c13773e2.ad || c13773e.vip.length != c13773e2.vip.length) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r6v0, types: [eّۗ۟, java.lang.Object] */
    public static ArrayList yandex(String str, List list, InterfaceC10808e interfaceC10808e) {
        Cpackage cpackage = new Cpackage(6);
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (Object obj : list) {
            String mo4378apply = interfaceC10808e.mo4378apply(obj);
            int mo1396e = cpackage.mo1396e(str, mo4378apply, (C12642e) cpackage.f36443e);
            if (mo1396e >= 0) {
                ?? obj2 = new Object();
                obj2.f25426e = obj;
                obj2.f25424e = mo4378apply;
                obj2.f25423e = mo1396e;
                obj2.f25425e = i;
                arrayList.add(obj2);
            }
            i++;
        }
        Collections.sort(arrayList, Collections.reverseOrder());
        return arrayList;
    }

    public void advert(String str) {
    }

    public void mopub() {
    }

    public abstract View purchase(Context context, ViewGroup viewGroup);

    public abstract void smaato(int i);

    public abstract View startapp();
}
