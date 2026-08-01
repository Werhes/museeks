package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.graphics.RectF;
import android.os.Build;
import android.os.Bundle;
import android.text.Layout;
import android.util.Log;
import androidx.car.app.model.Alert;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CharsetEncoder;
import java.text.Bidi;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٖ۟ۚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC16540e {
    public static final C2892e ad = new C2892e(987320134, false, new C7478e(11));
    public static final C2892e vip = new C2892e(-1482812322, false, new C14866e(29));
    public static final C2892e metrica = new C2892e(1746379670, false, new C10387e(0));
    public static final C2892e license = new C2892e(1869283607, false, new C10387e(1));

    public static byte[] ad(byte[] bArr) {
        if (bArr.length != 16) {
            throw new IllegalArgumentException("value must be a block.");
        }
        byte[] bArr2 = new byte[16];
        for (int i = 0; i < 16; i++) {
            byte b = (byte) ((bArr[i] << 1) & 254);
            bArr2[i] = b;
            if (i < 15) {
                bArr2[i] = (byte) (((byte) ((bArr[i + 1] >> 7) & 1)) | b);
            }
        }
        bArr2[15] = (byte) (((byte) ((bArr[0] >> 7) & 135)) ^ bArr2[15]);
        return bArr2;
    }

    public static Intent appmetrica(AbstractActivityC1752e abstractActivityC1752e) {
        Intent parentActivityIntent = abstractActivityC1752e.getParentActivityIntent();
        if (parentActivityIntent != null) {
            return parentActivityIntent;
        }
        try {
            String billing = billing(abstractActivityC1752e, abstractActivityC1752e.getComponentName());
            if (billing == null) {
                return null;
            }
            ComponentName componentName = new ComponentName(abstractActivityC1752e, billing);
            try {
                return billing(abstractActivityC1752e, componentName) == null ? Intent.makeMainActivity(componentName) : new Intent().setComponent(componentName);
            } catch (PackageManager.NameNotFoundException unused) {
                Log.e("NavUtils", "getParentActivityIntent: bad parentActivityName '" + billing + "' in manifest");
                return null;
            }
        } catch (PackageManager.NameNotFoundException e) {
            throw new IllegalArgumentException(e);
        }
    }

    public static String billing(Context context, ComponentName componentName) {
        String string;
        PackageManager packageManager = context.getPackageManager();
        int i = Build.VERSION.SDK_INT;
        ActivityInfo activityInfo = packageManager.getActivityInfo(componentName, i >= 29 ? 269222528 : i >= 24 ? 787072 : 640);
        String str = activityInfo.parentActivityName;
        if (str != null) {
            return str;
        }
        Bundle bundle = activityInfo.metaData;
        if (bundle == null || (string = bundle.getString("android.support.PARENT_ACTIVITY")) == null) {
            return null;
        }
        if (string.charAt(0) != '.') {
            return string;
        }
        return context.getPackageName() + string;
    }

    public static final float license(int i, int i2, float[] fArr) {
        return fArr[((i - i2) * 2) + 1];
    }

    public static final void metrica(CharsetEncoder charsetEncoder, C12402e c12402e, CharSequence charSequence, int i, int i2) {
        if (i >= i2) {
            return;
        }
        do {
            byte[] billing = AbstractC6629e.billing(charsetEncoder, charSequence, i, i2);
            c12402e.write(billing, 0, billing.length);
            int length = billing.length;
            if (length < 0) {
                throw new IllegalStateException("Check failed.");
            }
            i += length;
        } while (i < i2);
    }

    public static Intent purchase(Context context, ComponentName componentName) {
        String billing = billing(context, componentName);
        if (billing == null) {
            return null;
        }
        ComponentName componentName2 = new ComponentName(componentName.getPackageName(), billing);
        return billing(context, componentName2) == null ? Intent.makeMainActivity(componentName2) : new Intent().setComponent(componentName2);
    }

    public static final String vip(CharsetDecoder charsetDecoder, InterfaceC17430e interfaceC17430e) {
        StringBuilder sb = new StringBuilder((int) Math.min(Alert.DURATION_SHOW_INDEFINITELY, interfaceC17430e.metrica().f24832e));
        if (AbstractC7890e.billing(charsetDecoder.charset(), AbstractC5508e.ad)) {
            sb.append((CharSequence) AbstractC5756e.license(interfaceC17430e));
        } else {
            long j = interfaceC17430e.metrica().f24832e;
            sb.append((CharSequence) new String(AbstractC12731e.license(interfaceC17430e, -1), charsetDecoder.charset()));
        }
        return sb.toString();
    }

    public static final int yandex(C6458e c6458e, Layout layout, C18464e c18464e, int i, RectF rectF, InterfaceC14403e interfaceC14403e, C11213e c11213e, boolean z) {
        C2429e[] c2429eArr;
        int i2;
        int i3;
        C2429e[] c2429eArr2;
        int i4;
        int smaato;
        int i5;
        int i6;
        int appmetrica;
        Bidi createLineBidi;
        boolean z2;
        float ad2;
        float ad3;
        float f;
        int lineTop = layout.getLineTop(i);
        int lineBottom = layout.getLineBottom(i);
        int lineStart = layout.getLineStart(i);
        int lineEnd = layout.getLineEnd(i);
        if (lineStart == lineEnd) {
            return -1;
        }
        int i7 = (lineEnd - lineStart) * 2;
        float[] fArr = new float[i7];
        Layout layout2 = c6458e.purchase;
        int lineStart2 = layout2.getLineStart(i);
        int purchase = c6458e.purchase(i);
        if (i7 < (purchase - lineStart2) * 2) {
            AbstractC5525e.ad("array.size - arrayStart must be greater or equal than (endOffset - startOffset) * 2");
        }
        C6456e c6456e = new C6456e(c6458e);
        boolean z3 = false;
        boolean z4 = layout2.getParagraphDirection(i) == 1;
        int i8 = 0;
        while (lineStart2 < purchase) {
            boolean isRtlCharAt = layout2.isRtlCharAt(lineStart2);
            if (z4 && !isRtlCharAt) {
                ad2 = c6456e.ad(lineStart2, z3, z3, true);
                f = c6456e.ad(lineStart2 + 1, true, true, true);
                z2 = z4;
            } else if (z4 && isRtlCharAt) {
                z2 = z4;
                f = c6456e.ad(lineStart2, false, false, false);
                ad2 = c6456e.ad(lineStart2 + 1, true, true, false);
            } else {
                z2 = z4;
                if (isRtlCharAt) {
                    ad3 = c6456e.ad(lineStart2, false, false, true);
                    ad2 = c6456e.ad(lineStart2 + 1, true, true, true);
                } else {
                    ad2 = c6456e.ad(lineStart2, false, false, false);
                    ad3 = c6456e.ad(lineStart2 + 1, true, true, false);
                }
                f = ad3;
            }
            fArr[i8] = ad2;
            fArr[i8 + 1] = f;
            i8 += 2;
            lineStart2++;
            z4 = z2;
            z3 = false;
        }
        Layout layout3 = (Layout) c18464e.f36191e;
        int lineStart3 = layout3.getLineStart(i);
        int lineEnd2 = layout3.getLineEnd(i);
        int m4491e = c18464e.m4491e(lineStart3, false);
        int m4504e = c18464e.m4504e(m4491e);
        int i9 = lineStart3 - m4504e;
        int i10 = lineEnd2 - m4504e;
        Bidi m4488e = c18464e.m4488e(m4491e);
        if (m4488e == null || (createLineBidi = m4488e.createLineBidi(i9, i10)) == null) {
            i2 = 0;
            c2429eArr = new C2429e[]{new C2429e(lineStart3, lineEnd2, layout3.isRtlCharAt(lineStart3))};
        } else {
            int runCount = createLineBidi.getRunCount();
            c2429eArr = new C2429e[runCount];
            int i11 = 0;
            while (i11 < runCount) {
                int i12 = runCount;
                c2429eArr[i11] = new C2429e(createLineBidi.getRunStart(i11) + lineStart3, createLineBidi.getRunLimit(i11) + lineStart3, createLineBidi.getRunLevel(i11) % 2 == 1);
                i11++;
                runCount = i12;
            }
            i2 = 0;
        }
        C11241e c11241e = z ? new C11241e(i2, c2429eArr.length - 1, 1) : new C11241e(c2429eArr.length - 1, i2, -1);
        int i13 = c11241e.f22523e;
        int i14 = c11241e.f22522e;
        int i15 = c11241e.f22521e;
        if ((i15 <= 0 || i13 > i14) && (i15 >= 0 || i14 > i13)) {
            return -1;
        }
        while (true) {
            C2429e c2429e = c2429eArr[i13];
            boolean z5 = c2429e.metrica;
            int i16 = c2429e.ad;
            int i17 = c2429e.vip;
            float f2 = z5 ? fArr[((i17 - 1) - lineStart) * 2] : fArr[(i16 - lineStart) * 2];
            float license2 = z5 ? license(i16, lineStart, fArr) : license(i17 - 1, lineStart, fArr);
            if (z) {
                float f3 = rectF.left;
                if (license2 >= f3) {
                    i3 = i15;
                    float f4 = rectF.right;
                    if (f2 <= f4) {
                        if ((z5 || f3 > f2) && (!z5 || f4 < license2)) {
                            int i18 = i17;
                            int i19 = i16;
                            while (true) {
                                i5 = i18;
                                if (i18 - i19 <= 1) {
                                    break;
                                }
                                int i20 = (i5 + i19) / 2;
                                float f5 = fArr[(i20 - lineStart) * 2];
                                if ((z5 || f5 <= rectF.left) && (!z5 || f5 >= rectF.right)) {
                                    i18 = i5;
                                    i19 = i20;
                                } else {
                                    i18 = i20;
                                }
                            }
                            i6 = z5 ? i5 : i19;
                        } else {
                            i6 = i16;
                        }
                        int smaato2 = interfaceC14403e.smaato(i6);
                        if (smaato2 != -1 && (appmetrica = interfaceC14403e.appmetrica(smaato2)) < i17) {
                            if (appmetrica >= i16) {
                                i16 = appmetrica;
                            }
                            if (smaato2 > i17) {
                                smaato2 = i17;
                            }
                            c2429eArr2 = c2429eArr;
                            RectF rectF2 = new RectF(0.0f, lineTop, 0.0f, lineBottom);
                            int i21 = smaato2;
                            while (true) {
                                rectF2.left = z5 ? fArr[((i21 - 1) - lineStart) * 2] : fArr[(i16 - lineStart) * 2];
                                rectF2.right = z5 ? license(i16, lineStart, fArr) : license(i21 - 1, lineStart, fArr);
                                if (!((Boolean) c11213e.invoke(rectF2, rectF)).booleanValue()) {
                                    i16 = interfaceC14403e.ad(i16);
                                    if (i16 == -1 || i16 >= i17) {
                                        break;
                                    }
                                    i21 = interfaceC14403e.smaato(i16);
                                    if (i21 > i17) {
                                        i21 = i17;
                                    }
                                } else {
                                    break;
                                }
                            }
                            i16 = -1;
                        }
                    }
                } else {
                    i3 = i15;
                }
                c2429eArr2 = c2429eArr;
                i16 = -1;
            } else {
                i3 = i15;
                c2429eArr2 = c2429eArr;
                float f6 = rectF.left;
                if (license2 >= f6) {
                    float f7 = rectF.right;
                    if (f2 <= f7) {
                        if ((z5 || f7 < license2) && (!z5 || f6 > f2)) {
                            int i22 = i17;
                            int i23 = i16;
                            while (i22 - i23 > 1) {
                                int i24 = (i22 + i23) / 2;
                                float f8 = fArr[(i24 - lineStart) * 2];
                                int i25 = i22;
                                if ((z5 || f8 <= rectF.right) && (!z5 || f8 >= rectF.left)) {
                                    i22 = i25;
                                    i23 = i24;
                                } else {
                                    i22 = i24;
                                }
                            }
                            i4 = z5 ? i22 : i23;
                        } else {
                            i4 = i17 - 1;
                        }
                        int appmetrica2 = interfaceC14403e.appmetrica(i4 + 1);
                        if (appmetrica2 != -1 && (smaato = interfaceC14403e.smaato(appmetrica2)) > i16) {
                            if (appmetrica2 < i16) {
                                appmetrica2 = i16;
                            }
                            if (smaato <= i17) {
                                i17 = smaato;
                            }
                            RectF rectF3 = new RectF(0.0f, lineTop, 0.0f, lineBottom);
                            int i26 = appmetrica2;
                            while (true) {
                                rectF3.left = z5 ? fArr[((i17 - 1) - lineStart) * 2] : fArr[(i26 - lineStart) * 2];
                                rectF3.right = z5 ? license(i26, lineStart, fArr) : license(i17 - 1, lineStart, fArr);
                                if (!((Boolean) c11213e.invoke(rectF3, rectF)).booleanValue()) {
                                    i17 = interfaceC14403e.metrica(i17);
                                    if (i17 == -1 || i17 <= i16) {
                                        break;
                                    }
                                    i26 = interfaceC14403e.appmetrica(i17);
                                    if (i26 < i16) {
                                        i26 = i16;
                                    }
                                } else {
                                    break;
                                }
                            }
                        }
                    }
                }
                i17 = -1;
                i16 = i17;
            }
            if (i16 >= 0) {
                return i16;
            }
            if (i13 == i14) {
                return -1;
            }
            i13 += i3;
            i15 = i3;
            c2429eArr = c2429eArr2;
        }
    }
}
