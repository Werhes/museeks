package defpackage;

import android.app.Activity;
import android.content.ContentProviderClient;
import android.content.Intent;
import android.content.res.TypedArray;
import android.drm.DrmManagerClient;
import android.media.MediaDrm;
import android.media.MediaMetadataRetriever;
import android.util.Range;
import android.util.Size;
import android.view.View;
import android.view.ViewGroup;
import androidx.car.app.model.Alert;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.ExecutorService;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌّٜ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract /* synthetic */ class AbstractC8647e {
    public static boolean Signature(InterfaceC12438e interfaceC12438e) {
        return ((Boolean) interfaceC12438e.smaato(InterfaceC12438e.f24894e, Boolean.FALSE)).booleanValue();
    }

    public static EnumC12633e ad(InterfaceC12438e interfaceC12438e) {
        return (EnumC12633e) interfaceC12438e.subscription(InterfaceC12438e.f24886e);
    }

    public static int adcel(InterfaceC12438e interfaceC12438e) {
        return ((Integer) interfaceC12438e.smaato(InterfaceC12438e.f24901e, 0)).intValue();
    }

    public static void admob(Activity activity) {
        try {
            Intent intent = new Intent("android.speech.action.RECOGNIZE_SPEECH");
            intent.putExtra("android.speech.extra.LANGUAGE_MODEL", "free_form");
            activity.startActivityForResult(intent, 200);
        } catch (Exception unused) {
            AbstractC15615e.ad(new C1478e(0, activity, "На устройстве не обнаружено приложений для распознавания голоса"));
        }
    }

    public static String ads(StringBuilder sb, String str, String str2, String str3) {
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
        return sb.toString();
    }

    public static Range advert(InterfaceC12438e interfaceC12438e, Range range) {
        return (Range) interfaceC12438e.smaato(InterfaceC12438e.f24889e, range);
    }

    public static boolean amazon(InterfaceC12438e interfaceC12438e) {
        return ((Boolean) interfaceC12438e.smaato(InterfaceC12438e.f24899e, Boolean.FALSE)).booleanValue();
    }

    public static String applovin(String str, int i, char c) {
        return str + i + c;
    }

    public static C11469e appmetrica(InterfaceC12438e interfaceC12438e) {
        return (C11469e) interfaceC12438e.smaato(InterfaceC12438e.f24893e, null);
    }

    public static C0687e billing(InterfaceC12438e interfaceC12438e) {
        return (C0687e) interfaceC12438e.smaato(InterfaceC12438e.f24888e, null);
    }

    /* renamed from: class, reason: not valid java name */
    public static /* synthetic */ void m2455class(C11058e c11058e) {
        if (c11058e instanceof AutoCloseable) {
            c11058e.close();
        } else {
            if (!(c11058e instanceof ExecutorService)) {
                throw new IllegalArgumentException();
            }
            AbstractC6418e.admob();
        }
    }

    public static void crashlytics(long j, AbstractC13345e abstractC13345e, AbstractC3442e abstractC3442e, String str) {
        abstractC13345e.purchase(abstractC3442e, Long.valueOf(j));
        abstractC3442e.loadAd(str);
    }

    /* renamed from: extends, reason: not valid java name */
    public static /* synthetic */ String m2456extends(int i) {
        switch (i) {
            case 1:
                return "RLM_TYPE_NULL";
            case 2:
                return "RLM_TYPE_INT";
            case 3:
                return "RLM_TYPE_BOOL";
            case 4:
                return "RLM_TYPE_STRING";
            case 5:
                return "RLM_TYPE_BINARY";
            case 6:
                return "RLM_TYPE_TIMESTAMP";
            case 7:
                return "RLM_TYPE_FLOAT";
            case 8:
                return "RLM_TYPE_DOUBLE";
            case 9:
                return "RLM_TYPE_DECIMAL128";
            case 10:
                return "RLM_TYPE_OBJECT_ID";
            case 11:
                return "RLM_TYPE_LINK";
            case 12:
                return "RLM_TYPE_UUID";
            case 13:
                return "RLM_TYPE_LIST";
            case 14:
                return "RLM_TYPE_DICTIONARY";
            default:
                throw null;
        }
    }

    public static void firebase(C11445e c11445e, InterfaceC18147e interfaceC18147e) {
        interfaceC18147e.billing(new C16975e(c11445e));
    }

    /* renamed from: goto, reason: not valid java name */
    public static void m2457goto(String str, String str2, ArrayList arrayList) {
        arrayList.add(str2.concat(AbstractC4224e.advert(str)));
    }

    public static String inmobi(int i, int i2, String str, String str2, String str3) {
        return str + i + str2 + i2 + str3;
    }

    /* renamed from: interface, reason: not valid java name */
    public static /* synthetic */ void m2458interface(AutoCloseable autoCloseable) {
        if (autoCloseable instanceof AutoCloseable) {
            autoCloseable.close();
            return;
        }
        if (autoCloseable instanceof ExecutorService) {
            AbstractC6418e.smaato((ExecutorService) autoCloseable);
            return;
        }
        if (autoCloseable instanceof TypedArray) {
            ((TypedArray) autoCloseable).recycle();
            return;
        }
        if (autoCloseable instanceof MediaMetadataRetriever) {
            ((MediaMetadataRetriever) autoCloseable).release();
            return;
        }
        if (autoCloseable instanceof MediaDrm) {
            ((MediaDrm) autoCloseable).release();
        } else if (autoCloseable instanceof DrmManagerClient) {
            ((DrmManagerClient) autoCloseable).release();
        } else {
            if (!(autoCloseable instanceof ContentProviderClient)) {
                throw new IllegalArgumentException();
            }
            ((ContentProviderClient) autoCloseable).release();
        }
    }

    public static String isPro(int i, String str, StringBuilder sb) {
        sb.append(str);
        sb.append(i);
        return sb.toString();
    }

    public static ClassCastException isVip(Object obj) {
        obj.getClass();
        return new ClassCastException();
    }

    public static C11469e license(InterfaceC12438e interfaceC12438e) {
        return (C11469e) interfaceC12438e.subscription(InterfaceC12438e.f24893e);
    }

    public static boolean loadAd(InterfaceC12438e interfaceC12438e) {
        Boolean bool = (Boolean) interfaceC12438e.smaato(InterfaceC12438e.f24885e, Boolean.FALSE);
        Objects.requireNonNull(bool);
        return bool.booleanValue();
    }

    public static C9937e metrica(InterfaceC12438e interfaceC12438e) {
        return (C9937e) interfaceC12438e.smaato(InterfaceC12438e.f24897e, null);
    }

    public static C6717e mopub(InterfaceC12438e interfaceC12438e) {
        C6717e c6717e = (C6717e) interfaceC12438e.smaato(InterfaceC12438e.f24898e, new Object());
        Objects.requireNonNull(c6717e);
        return c6717e;
    }

    /* renamed from: native, reason: not valid java name */
    public static void m2459native(boolean z, AbstractC13345e abstractC13345e, AbstractC3442e abstractC3442e, String str) {
        abstractC13345e.purchase(abstractC3442e, Boolean.valueOf(z));
        abstractC3442e.loadAd(str);
    }

    public static StringBuilder premium(StringBuilder sb, boolean z, ArrayList arrayList, String str) {
        sb.append(z);
        arrayList.add(sb.toString());
        return new StringBuilder(str);
    }

    public static /* synthetic */ int pro(int i) {
        if (i == 1) {
            return 135;
        }
        if (i == 2) {
            return 270;
        }
        if (i == 3) {
            return 300;
        }
        if (i == 4) {
            return 600;
        }
        if (i == 5) {
            return 1200;
        }
        throw null;
    }

    public static int purchase(InterfaceC12438e interfaceC12438e) {
        return ((Integer) interfaceC12438e.smaato(InterfaceC12438e.f24900e, 0)).intValue();
    }

    public static C16320e remoteconfig(C1964e c1964e) {
        View view = c1964e.f5163e;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        InterfaceC10650e subscription = subscription(layoutParams != null ? layoutParams.width : -1, view.getWidth(), view.getPaddingRight() + view.getPaddingLeft());
        if (subscription == null) {
            return null;
        }
        ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
        InterfaceC10650e subscription2 = subscription(layoutParams2 != null ? layoutParams2.height : -1, view.getHeight(), view.getPaddingBottom() + view.getPaddingTop());
        if (subscription2 == null) {
            return null;
        }
        return new C16320e(subscription, subscription2);
    }

    public static int signatures(int i, C14808e c14808e, int i2, int i3) {
        return c14808e.advert(i2, Integer.valueOf(i)) + i3;
    }

    public static int smaato(InterfaceC12438e interfaceC12438e) {
        return ((Integer) interfaceC12438e.smaato(InterfaceC12438e.f24896e, 0)).intValue();
    }

    public static EnumC2392e startapp(InterfaceC12438e interfaceC12438e) {
        EnumC2392e enumC2392e = (EnumC2392e) interfaceC12438e.smaato(InterfaceC12438e.f24891e, EnumC2392e.DEFAULT);
        Objects.requireNonNull(enumC2392e);
        return enumC2392e;
    }

    public static void subs(int i, AbstractC13345e abstractC13345e, AbstractC3442e abstractC3442e, String str) {
        abstractC13345e.purchase(abstractC3442e, Integer.valueOf(i));
        abstractC3442e.loadAd(str);
    }

    public static InterfaceC10650e subscription(int i, int i2, int i3) {
        if (i == -2) {
            return C11657e.ad;
        }
        int i4 = i - i3;
        if (i4 > 0) {
            AbstractC17540e.ad(i4);
            return new C3645e(i4);
        }
        int i5 = i2 - i3;
        if (i5 <= 0) {
            return null;
        }
        AbstractC17540e.ad(i5);
        return new C3645e(i5);
    }

    public static int tapsense(boolean z, C14808e c14808e, int i, int i2) {
        return c14808e.advert(i, Boolean.valueOf(z)) + i2;
    }

    /* renamed from: this, reason: not valid java name */
    public static void m2460this(StringBuilder sb, boolean z, ArrayList arrayList) {
        sb.append(z);
        arrayList.add(sb.toString());
    }

    /* renamed from: throw, reason: not valid java name */
    public static /* synthetic */ String m2461throw(int i) {
        return i != 1 ? i != 2 ? i != 3 ? "null" : "OUT_VARIANCE" : "IN_VARIANCE" : "INVARIANT";
    }

    /* renamed from: try, reason: not valid java name */
    public static /* synthetic */ String m2462try(int i) {
        return i != 1 ? i != 2 ? i != 3 ? "null" : "INACTIVE" : "ACTIVE_NON_STREAMING" : "ACTIVE_STREAMING";
    }

    public static int vip(InterfaceC12438e interfaceC12438e, Size size) {
        Map map = (Map) interfaceC12438e.smaato(InterfaceC12438e.f24890e, null);
        if (map == null || !map.containsKey(size)) {
            return Alert.DURATION_SHOW_INDEFINITELY;
        }
        Integer num = (Integer) map.get(size);
        Objects.requireNonNull(num);
        return num.intValue();
    }

    /* renamed from: while, reason: not valid java name */
    public static /* synthetic */ String m2463while(int i) {
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "null" : "RELEASED" : "READY" : "PENDING_RELEASE" : "INITIALIZING" : "NOT_INITIALIZED";
    }

    public static int yandex(InterfaceC12438e interfaceC12438e) {
        return ((Integer) interfaceC12438e.smaato(InterfaceC12438e.f24892e, 0)).intValue();
    }
}
