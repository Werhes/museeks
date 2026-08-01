package defpackage;

import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.TypeEvaluator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.InflateException;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import java.util.ArrayList;
import org.conscrypt.BuildConfig;
import org.conscrypt.PSKKeyManager;
import org.xmlpull.v1.XmlPullParser;
import ua.itaysonlab.vkx.R;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؒۛٛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC1328e {
    public static final C2892e ad = new C2892e(823213207, false, new C9012e(8));
    public static final C2892e vip = new C2892e(779864969, false, new C9375e(5));
    public static final C2892e metrica = new C2892e(1646565044, false, new C10417e(21));
    public static final C2892e license = new C2892e(-1403050197, false, new C9012e(9));
    public static final C2892e appmetrica = new C2892e(-1363855322, false, new C9012e(10));

    /* JADX WARN: Code restructure failed: missing block: B:23:0x006b, code lost:
    
        if ((r33 & 4) != 0) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:39:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0040  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void ad(final int r27, boolean r28, long r29, defpackage.C13770e r31, final int r32, final int r33) {
        /*
            Method dump skipped, instructions count: 263
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC1328e.ad(int, boolean, long, eٓؕۥ, int, int):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x03c9, code lost:
    
        r1 = new android.animation.Animator[r18.size()];
        r2 = r18.iterator();
        r11 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x03d8, code lost:
    
        if (r2.hasNext() == false) goto L225;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x03da, code lost:
    
        r1[r11] = (android.animation.Animator) r2.next();
        r11 = r11 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x03e6, code lost:
    
        if (r33 != 0) goto L216;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x03e8, code lost:
    
        r32.playTogether(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x03eb, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x03ec, code lost:
    
        r32.playSequentially(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x03ef, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0017, code lost:
    
        r18 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x03c5, code lost:
    
        if (r32 == null) goto L217;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x03c7, code lost:
    
        if (r18 == null) goto L217;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0397 A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.animation.Animator appmetrica(android.content.Context r27, android.content.res.Resources r28, android.content.res.Resources.Theme r29, org.xmlpull.v1.XmlPullParser r30, android.util.AttributeSet r31, android.animation.AnimatorSet r32, int r33) {
        /*
            Method dump skipped, instructions count: 1008
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC1328e.appmetrica(android.content.Context, android.content.res.Resources, android.content.res.Resources$Theme, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.animation.AnimatorSet, int):android.animation.Animator");
    }

    public static boolean billing(int i) {
        return i >= 28 && i <= 31;
    }

    public static boolean license(C1292e c1292e, C15008e c15008e, int i, C14829e c14829e) {
        long subs = c1292e.subs();
        long j = subs >>> 16;
        if (j != i) {
            return false;
        }
        boolean z = (j & 1) == 1;
        int i2 = (int) ((subs >> 12) & 15);
        int i3 = (int) ((subs >> 8) & 15);
        int i4 = (int) ((subs >> 4) & 15);
        int i5 = (int) ((subs >> 1) & 7);
        boolean z2 = (subs & 1) == 1;
        if (i4 <= 7) {
            if (i4 != c15008e.billing - 1) {
                return false;
            }
        } else if (i4 > 10 || c15008e.billing != 2) {
            return false;
        }
        if (!(i5 == 0 || i5 == c15008e.startapp) || z2) {
            return false;
        }
        try {
            long m569this = c1292e.m569this();
            if (!z) {
                m569this *= c15008e.vip;
            }
            long j2 = c15008e.adcel;
            if (j2 != 0 && m569this > j2) {
                return false;
            }
            c14829e.f29362e = m569this;
            int startapp = startapp(i2, c1292e);
            long j3 = c15008e.adcel;
            boolean z3 = j3 == 0 || m569this + ((long) startapp) >= j3;
            if (startapp == -1) {
                return false;
            }
            if ((!z3 && startapp < c15008e.ad) || startapp > c15008e.vip) {
                return false;
            }
            int i6 = c15008e.appmetrica;
            if (i3 != 0) {
                if (i3 <= 11) {
                    if (i3 != c15008e.purchase) {
                        return false;
                    }
                } else if (i3 != 12) {
                    if (i3 > 14) {
                        return false;
                    }
                    int m565goto = c1292e.m565goto();
                    if (i3 == 14) {
                        m565goto *= 10;
                    }
                    if (m565goto != i6) {
                        return false;
                    }
                } else if (c1292e.ads() * 1000 != i6) {
                    return false;
                }
            }
            int ads = c1292e.ads();
            int i7 = c1292e.vip;
            byte[] bArr = c1292e.ad;
            int i8 = i7 - 1;
            int i9 = 0;
            for (int i10 = c1292e.vip; i10 < i8; i10++) {
                i9 = AbstractC9413e.advert[i9 ^ (bArr[i10] & 255)];
            }
            String str = AbstractC9413e.ad;
            if (ads != i9) {
                return false;
            }
            if (c1292e.ad() != 0) {
                int adcel = c1292e.adcel();
                if ((adcel & 128) != 0) {
                    return false;
                }
                int i11 = (adcel & 126) >> 1;
                if ((i11 >= 2 && i11 <= 7) || (i11 >= 13 && i11 <= 31)) {
                    AbstractC2803e.advert("FlacFrameReader", "Ignoring frame where first subframe has a reserved type: " + i11);
                    return false;
                }
            }
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    public static final Object metrica(C4602e c4602e, AbstractC10731e abstractC10731e) {
        C13578e c13578e = new C13578e(1, AbstractC10558e.startapp(abstractC10731e));
        c13578e.tapsense();
        c4602e.appmetrica(new C17974e(18, c13578e));
        c13578e.inmobi(new C12278e(c4602e, 1));
        return c13578e.signatures();
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [android.animation.TypeEvaluator, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v26, types: [android.animation.TypeEvaluator, java.lang.Object] */
    public static PropertyValuesHolder purchase(TypedArray typedArray, int i, int i2, int i3, String str) {
        PropertyValuesHolder ofFloat;
        TypedValue peekValue = typedArray.peekValue(i2);
        boolean z = peekValue != null;
        int i4 = z ? peekValue.type : 0;
        TypedValue peekValue2 = typedArray.peekValue(i3);
        boolean z2 = peekValue2 != null;
        int i5 = z2 ? peekValue2.type : 0;
        if (i == 4) {
            i = ((z && billing(i4)) || (z2 && billing(i5))) ? 3 : 0;
        }
        boolean z3 = i == 0;
        PropertyValuesHolder propertyValuesHolder = null;
        if (i == 2) {
            String string = typedArray.getString(i2);
            String string2 = typedArray.getString(i3);
            C13773e[] license2 = AbstractC18491e.license(string);
            C13773e[] license3 = AbstractC18491e.license(string2);
            if (license2 != null || license3 != null) {
                if (license2 != null) {
                    ?? obj = new Object();
                    if (license3 == null) {
                        return PropertyValuesHolder.ofObject(str, (TypeEvaluator) obj, license2);
                    }
                    if (AbstractC18491e.vip(license2, license3)) {
                        return PropertyValuesHolder.ofObject(str, (TypeEvaluator) obj, license2, license3);
                    }
                    throw new InflateException(AbstractC17861e.admob(" Can't morph from ", string, " to ", string2));
                }
                if (license3 != null) {
                    return PropertyValuesHolder.ofObject(str, (TypeEvaluator) new Object(), license3);
                }
            }
            return null;
        }
        C0486e c0486e = i == 3 ? C0486e.ad : null;
        if (z3) {
            if (z) {
                float dimension = i4 == 5 ? typedArray.getDimension(i2, 0.0f) : typedArray.getFloat(i2, 0.0f);
                if (z2) {
                    ofFloat = PropertyValuesHolder.ofFloat(str, dimension, i5 == 5 ? typedArray.getDimension(i3, 0.0f) : typedArray.getFloat(i3, 0.0f));
                } else {
                    ofFloat = PropertyValuesHolder.ofFloat(str, dimension);
                }
            } else {
                ofFloat = PropertyValuesHolder.ofFloat(str, i5 == 5 ? typedArray.getDimension(i3, 0.0f) : typedArray.getFloat(i3, 0.0f));
            }
            propertyValuesHolder = ofFloat;
        } else if (z) {
            int dimension2 = i4 == 5 ? (int) typedArray.getDimension(i2, 0.0f) : billing(i4) ? typedArray.getColor(i2, 0) : typedArray.getInt(i2, 0);
            if (z2) {
                propertyValuesHolder = PropertyValuesHolder.ofInt(str, dimension2, i5 == 5 ? (int) typedArray.getDimension(i3, 0.0f) : billing(i5) ? typedArray.getColor(i3, 0) : typedArray.getInt(i3, 0));
            } else {
                propertyValuesHolder = PropertyValuesHolder.ofInt(str, dimension2);
            }
        } else if (z2) {
            propertyValuesHolder = PropertyValuesHolder.ofInt(str, i5 == 5 ? (int) typedArray.getDimension(i3, 0.0f) : billing(i5) ? typedArray.getColor(i3, 0) : typedArray.getInt(i3, 0));
        }
        if (propertyValuesHolder != null && c0486e != null) {
            propertyValuesHolder.setEvaluator(c0486e);
        }
        return propertyValuesHolder;
    }

    public static int startapp(int i, C1292e c1292e) {
        switch (i) {
            case 1:
                return 192;
            case 2:
            case 3:
            case 4:
            case 5:
                return 576 << (i - 2);
            case 6:
                return c1292e.ads() + 1;
            case 7:
                return c1292e.m565goto() + 1;
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                return PSKKeyManager.MAX_KEY_LENGTH_BYTES << (i - 8);
            default:
                return -1;
        }
    }

    public static final void vip(InterfaceC12864e interfaceC12864e, long j, C13770e c13770e, int i, int i2) {
        int i3;
        InterfaceC12864e interfaceC12864e2;
        long j2;
        InterfaceC12864e interfaceC12864e3;
        int i4;
        long j3;
        c13770e.m3671package(-1316826184);
        int i5 = i2 & 1;
        if (i5 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = i | (c13770e.purchase(interfaceC12864e) ? 4 : 2);
        } else {
            i3 = i;
        }
        int i6 = i3 | (((i2 & 2) == 0 && c13770e.appmetrica(j)) ? 32 : 16);
        if (c13770e.m3673protected(i6 & 1, (i6 & 19) != 18)) {
            c13770e.m3655case();
            if ((i & 1) == 0 || c13770e.isPro()) {
                InterfaceC12864e interfaceC12864e4 = i5 != 0 ? C0115e.f1276e : interfaceC12864e;
                if ((i2 & 2) != 0) {
                    j3 = ((C7019e) c13770e.adcel(AbstractC11785e.ad)).ad.remoteconfig;
                    int i7 = i6 & (-113);
                    interfaceC12864e3 = interfaceC12864e4;
                    i4 = i7;
                } else {
                    interfaceC12864e3 = interfaceC12864e4;
                    i4 = i6;
                    j3 = j;
                }
            } else {
                c13770e.m3659default();
                if ((i2 & 2) != 0) {
                    i6 &= -113;
                }
                j3 = j;
                i4 = i6;
                interfaceC12864e3 = interfaceC12864e;
            }
            c13770e.admob();
            int i8 = i4 << 6;
            AbstractC5647e.vip(AbstractC12475e.metrica(R.drawable.ic_explicit_outline_20, 0, c13770e), null, interfaceC12864e3, j3, c13770e, (i8 & 896) | 56 | (i8 & 7168), 0);
            interfaceC12864e2 = interfaceC12864e3;
            j2 = j3;
        } else {
            c13770e.m3659default();
            interfaceC12864e2 = interfaceC12864e;
            j2 = j;
        }
        C2846e subscription = c13770e.subscription();
        if (subscription != null) {
            subscription.license = new C1777e(interfaceC12864e2, j2, i, i2);
        }
    }

    public static ValueAnimator yandex(Context context, Resources resources, Resources.Theme theme, AttributeSet attributeSet, ObjectAnimator objectAnimator, XmlPullParser xmlPullParser) {
        ValueAnimator valueAnimator;
        int i;
        ValueAnimator valueAnimator2;
        TypedArray subscription = AbstractC13406e.subscription(resources, theme, attributeSet, AbstractC9180e.billing);
        TypedArray subscription2 = AbstractC13406e.subscription(resources, theme, attributeSet, AbstractC9180e.mopub);
        ValueAnimator valueAnimator3 = objectAnimator == null ? new ValueAnimator() : objectAnimator;
        long j = AbstractC13406e.smaato(xmlPullParser, "duration") ? subscription.getInt(1, 300) : 300;
        long j2 = xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "startOffset") != null ? subscription.getInt(2, 0) : 0;
        int i2 = xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "valueType") != null ? subscription.getInt(7, 4) : 4;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "valueFrom") != null && xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "valueTo") != null) {
            if (i2 == 4) {
                TypedValue peekValue = subscription.peekValue(5);
                boolean z = peekValue != null;
                int i3 = z ? peekValue.type : 0;
                TypedValue peekValue2 = subscription.peekValue(6);
                boolean z2 = peekValue2 != null;
                i2 = ((z && billing(i3)) || (z2 && billing(z2 ? peekValue2.type : 0))) ? 3 : 0;
            }
            PropertyValuesHolder purchase = purchase(subscription, i2, 5, 6, BuildConfig.FLAVOR);
            if (purchase != null) {
                valueAnimator3.setValues(purchase);
            }
        }
        valueAnimator3.setDuration(j);
        valueAnimator3.setStartDelay(j2);
        valueAnimator3.setRepeatCount(xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "repeatCount") != null ? subscription.getInt(3, 0) : 0);
        valueAnimator3.setRepeatMode(xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "repeatMode") != null ? subscription.getInt(4, 1) : 1);
        if (subscription2 != null) {
            ObjectAnimator objectAnimator2 = (ObjectAnimator) valueAnimator3;
            String adcel = AbstractC13406e.adcel(subscription2, xmlPullParser, "pathData", 1);
            if (adcel != null) {
                String adcel2 = AbstractC13406e.adcel(subscription2, xmlPullParser, "propertyXName", 2);
                String adcel3 = AbstractC13406e.adcel(subscription2, xmlPullParser, "propertyYName", 3);
                if (i2 != 2) {
                }
                if (adcel2 == null && adcel3 == null) {
                    throw new InflateException(subscription2.getPositionDescription() + " propertyXName or propertyYName is needed for PathData");
                }
                Path appmetrica2 = AbstractC18491e.appmetrica(adcel);
                PathMeasure pathMeasure = new PathMeasure(appmetrica2, false);
                ArrayList arrayList = new ArrayList();
                arrayList.add(Float.valueOf(0.0f));
                float f = 0.0f;
                do {
                    f += pathMeasure.getLength();
                    arrayList.add(Float.valueOf(f));
                } while (pathMeasure.nextContour());
                PathMeasure pathMeasure2 = new PathMeasure(appmetrica2, false);
                int min = Math.min(100, ((int) (f / 0.5f)) + 1);
                float[] fArr = new float[min];
                float[] fArr2 = new float[min];
                float[] fArr3 = new float[2];
                float f2 = f / (min - 1);
                int i4 = 0;
                valueAnimator = valueAnimator3;
                float f3 = 0.0f;
                int i5 = 0;
                while (true) {
                    if (i4 >= min) {
                        break;
                    }
                    int i6 = min;
                    pathMeasure2.getPosTan(f3 - ((Float) arrayList.get(i5)).floatValue(), fArr3, null);
                    fArr[i4] = fArr3[0];
                    fArr2[i4] = fArr3[1];
                    int i7 = i5 + 1;
                    f3 += f2;
                    if (i7 < arrayList.size() && f3 > ((Float) arrayList.get(i7)).floatValue()) {
                        pathMeasure2.nextContour();
                        i5 = i7;
                    }
                    i4++;
                    min = i6;
                }
                PropertyValuesHolder ofFloat = adcel2 != null ? PropertyValuesHolder.ofFloat(adcel2, fArr) : null;
                PropertyValuesHolder ofFloat2 = adcel3 != null ? PropertyValuesHolder.ofFloat(adcel3, fArr2) : null;
                if (ofFloat == null) {
                    objectAnimator2.setValues(ofFloat2);
                } else if (ofFloat2 == null) {
                    objectAnimator2.setValues(ofFloat);
                } else {
                    objectAnimator2.setValues(ofFloat, ofFloat2);
                }
                i = 0;
            } else {
                valueAnimator = valueAnimator3;
                i = 0;
                objectAnimator2.setPropertyName(AbstractC13406e.adcel(subscription2, xmlPullParser, "propertyName", 0));
            }
        } else {
            valueAnimator = valueAnimator3;
            i = 0;
        }
        int resourceId = xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "interpolator") != null ? subscription.getResourceId(i, i) : i;
        if (resourceId > 0) {
            Interpolator loadInterpolator = AnimationUtils.loadInterpolator(context, resourceId);
            AbstractC12110e.metrica(loadInterpolator, "Failed to parse interpolator, no start tag found");
            valueAnimator2 = valueAnimator;
            valueAnimator2.setInterpolator(loadInterpolator);
        } else {
            valueAnimator2 = valueAnimator;
        }
        subscription.recycle();
        if (subscription2 != null) {
            subscription2.recycle();
        }
        return valueAnimator2;
    }
}
