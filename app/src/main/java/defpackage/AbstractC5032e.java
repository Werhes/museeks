package defpackage;

import android.text.Spanned;
import androidx.car.app.model.Alert;
import java.text.BreakIterator;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؗٝؔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC5032e {
    public static final C2892e ad = new C2892e(297967481, false, new C16015e(15));
    public static Boolean license;
    public static final C1032e[] metrica;
    public static final C1032e vip;

    static {
        C1032e c1032e = new C1032e(-1, 7L, "moduleinstall", true);
        vip = c1032e;
        metrica = new C1032e[]{c1032e};
    }

    public static /* synthetic */ void ad(int i) {
        Object[] objArr = new Object[3];
        if (i == 1 || i == 2) {
            objArr[0] = "companionObject";
        } else if (i != 3) {
            objArr[0] = "propertyDescriptor";
        } else {
            objArr[0] = "memberDescriptor";
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/DescriptorsJvmAbiUtil";
        if (i == 1) {
            objArr[2] = "isClassCompanionObjectWithBackingFieldsInOuter";
        } else if (i == 2) {
            objArr[2] = "isMappedIntrinsicCompanionObject";
        } else if (i != 3) {
            objArr[2] = "isPropertyWithBackingFieldInOuterClass";
        } else {
            objArr[2] = "hasJvmFieldAnnotation";
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    public static final C5188e license() {
        if (!C5188e.license()) {
            return null;
        }
        C5188e ad2 = C5188e.ad();
        if (ad2.metrica() == 1) {
            return ad2;
        }
        return null;
    }

    public static final int metrica(int i, String str) {
        C5188e license2 = license();
        Integer num = null;
        if (license2 != null) {
            Integer valueOf = Integer.valueOf(license2.vip(str, Math.max(0, i - 1)));
            if (valueOf.intValue() != -1) {
                num = valueOf;
            }
        }
        if (num != null) {
            return num.intValue();
        }
        BreakIterator characterInstance = BreakIterator.getCharacterInstance();
        characterInstance.setText(str);
        return characterInstance.preceding(i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final int vip(int i, String str) {
        String str2;
        int i2;
        C5188e license2 = license();
        Integer num = null;
        if (license2 != null) {
            AbstractC4265e.yandex("Not initialized yet", license2.metrica() == 1);
            AbstractC4265e.billing(str, "charSequence cannot be null");
            C18478e c18478e = (C18478e) license2.appmetrica.vip;
            c18478e.getClass();
            if (i < 0 || i >= str.length()) {
                str2 = str;
                i2 = -1;
            } else {
                if (str instanceof Spanned) {
                    Spanned spanned = (Spanned) str;
                    C2205e[] c2205eArr = (C2205e[]) spanned.getSpans(i, i + 1, C2205e.class);
                    if (c2205eArr.length > 0) {
                        i2 = spanned.getSpanEnd(c2205eArr[0]);
                        str2 = str;
                    }
                }
                str2 = str;
                i2 = ((C13071e) c18478e.m4545instanceof(str2, Math.max(0, i - 16), Math.min(str.length(), i + 16), Alert.DURATION_SHOW_INDEFINITELY, true, new C13071e(i))).f26004e;
            }
            Integer valueOf = Integer.valueOf(i2);
            if (i2 != -1) {
                num = valueOf;
            }
        } else {
            str2 = str;
        }
        if (num != null) {
            return num.intValue();
        }
        BreakIterator characterInstance = BreakIterator.getCharacterInstance();
        characterInstance.setText(str2);
        return characterInstance.following(i);
    }
}
