package defpackage;

import android.graphics.Point;
import android.os.Binder;
import android.os.Build;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import android.view.View;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.conscrypt.PSKKeyManager;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٗٚۨ */
/* loaded from: classes3.dex */
public abstract class AbstractC17110e {
    public static final Class[] ad = {Serializable.class, Parcelable.class, String.class, SparseArray.class, Binder.class, Size.class, SizeF.class};

    public static final C13212e Signature(C17485e c17485e, C17221e c17221e) {
        int i = c17485e.f34254e;
        if ((i & 32) == 32) {
            return c17485e.f34255e;
        }
        if ((i & 64) == 64) {
            return c17221e.ad(c17485e.f34268e);
        }
        return null;
    }

    public static final boolean ad(Object obj) {
        if (obj instanceof InterfaceC16595e) {
            InterfaceC16595e interfaceC16595e = (InterfaceC16595e) obj;
            if (interfaceC16595e.vip() == C10990e.f21771e || interfaceC16595e.vip() == C12575e.f25232e || interfaceC16595e.vip() == C10990e.f21769e) {
                Object value = interfaceC16595e.getValue();
                if (value == null) {
                    return true;
                }
                return ad(value);
            }
        } else {
            if ((obj instanceof InterfaceC12561e) && (obj instanceof Serializable)) {
                return false;
            }
            for (int i = 0; i < 7; i++) {
                if (ad[i].isInstance(obj)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean adcel() {
        return (AbstractC6507e.loadAd(Build.MANUFACTURER, "Positivo", true) || AbstractC6507e.loadAd(Build.BRAND, "Positivo", true)) && "twist 2 pro".equalsIgnoreCase(Build.MODEL);
    }

    public static final C13212e admob(C9920e c9920e, C17221e c17221e) {
        int i = c9920e.f19585e;
        if ((i & 8) == 8) {
            return c9920e.f19602e;
        }
        if ((i & 16) == 16) {
            return c17221e.ad(c9920e.f19594e);
        }
        throw new IllegalStateException("No returnType in ProtoBuf.Function");
    }

    public static boolean advert() {
        if (!AbstractC6507e.loadAd(Build.MANUFACTURER, "Samsung", true) && !AbstractC6507e.loadAd(Build.BRAND, "Samsung", true)) {
            return false;
        }
        String str = Build.DEVICE;
        return "gta8".equalsIgnoreCase(str) || "gta8wifi".equalsIgnoreCase(str);
    }

    public static final C13212e amazon(C13212e c13212e, C17221e c17221e) {
        int i = c13212e.f26223e;
        if ((i & PSKKeyManager.MAX_KEY_LENGTH_BYTES) == 256) {
            return c13212e.f26221e;
        }
        if ((i & AbstractC1815e.AUDIO_CONTENT_BUFFER_SIZE) == 512) {
            return c17221e.ad(c13212e.f26225e);
        }
        return null;
    }

    public static final /* synthetic */ Point appmetrica(View view) {
        int[] iArr = {0, 0};
        view.getLocationOnScreen(iArr);
        return new Point(iArr[0] + ((int) view.getTranslationX()), iArr[1] + ((int) view.getTranslationY()));
    }

    public static boolean billing(String str) {
        return ("Connection".equalsIgnoreCase(str) || "Keep-Alive".equalsIgnoreCase(str) || "Proxy-Authenticate".equalsIgnoreCase(str) || "Proxy-Authorization".equalsIgnoreCase(str) || "TE".equalsIgnoreCase(str) || "Trailers".equalsIgnoreCase(str) || "Transfer-Encoding".equalsIgnoreCase(str) || "Upgrade".equalsIgnoreCase(str)) ? false : true;
    }

    public static final List license(C17485e c17485e, C17221e c17221e) {
        List list = c17485e.f34253e;
        if (list.isEmpty()) {
            list = null;
        }
        if (list == null) {
            List list2 = c17485e.f34252e;
            list = new ArrayList(AbstractC0746e.subscription(list2, 10));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                list.add(c17221e.ad(((Integer) it.next()).intValue()));
            }
        }
        return list;
    }

    public static final C13212e loadAd(C9920e c9920e, C17221e c17221e) {
        int i = c9920e.f19585e;
        if ((i & 32) == 32) {
            return c9920e.f19586e;
        }
        if ((i & 64) == 64) {
            return c17221e.ad(c9920e.f19595e);
        }
        return null;
    }

    public static final List metrica(C9920e c9920e, C17221e c17221e) {
        List list = c9920e.f19584e;
        if (list.isEmpty()) {
            list = null;
        }
        if (list == null) {
            List list2 = c9920e.f19583e;
            list = new ArrayList(AbstractC0746e.subscription(list2, 10));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                list.add(c17221e.ad(((Integer) it.next()).intValue()));
            }
        }
        return list;
    }

    public static boolean mopub() {
        return (AbstractC6507e.loadAd(Build.MANUFACTURER, "Samsung", true) || AbstractC6507e.loadAd(Build.BRAND, "Samsung", true)) && AbstractC6507e.pro(Build.MODEL, "SM-A536", false);
    }

    public static final C13212e pro(C10067e c10067e, C17221e c17221e) {
        int i = c10067e.f19883e;
        if ((i & 4) == 4) {
            return c10067e.f19891e;
        }
        if ((i & 8) == 8) {
            return c17221e.ad(c10067e.f19890e);
        }
        throw new IllegalStateException("No type in ProtoBuf.ValueParameter");
    }

    public static boolean purchase() {
        return (AbstractC6507e.loadAd(Build.MANUFACTURER, "Blu", true) || AbstractC6507e.loadAd(Build.BRAND, "Blu", true)) && "studio x10".equalsIgnoreCase(Build.MODEL);
    }

    public static final List remoteconfig(C2009e c2009e, C17221e c17221e) {
        List list = c2009e.f5273e;
        if (list.isEmpty()) {
            list = null;
        }
        if (list == null) {
            List list2 = c2009e.f5284e;
            list = new ArrayList(AbstractC0746e.subscription(list2, 10));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                list.add(c17221e.ad(((Integer) it.next()).intValue()));
            }
        }
        return list;
    }

    public static final List signatures(C8372e c8372e, C17221e c17221e) {
        List list = c8372e.f17131e;
        if (list.isEmpty()) {
            list = null;
        }
        if (list == null) {
            List list2 = c8372e.f17134e;
            list = new ArrayList(AbstractC0746e.subscription(list2, 10));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                list.add(c17221e.ad(((Integer) it.next()).intValue()));
            }
        }
        return list;
    }

    public static boolean smaato() {
        return (AbstractC6507e.loadAd(Build.MANUFACTURER, "Vivo", true) || AbstractC6507e.loadAd(Build.BRAND, "Vivo", true)) && "vivo 1805".equalsIgnoreCase(Build.MODEL);
    }

    public static boolean startapp() {
        return (AbstractC6507e.loadAd(Build.MANUFACTURER, "Motorola", true) || AbstractC6507e.loadAd(Build.BRAND, "Motorola", true)) && "moto e13".equalsIgnoreCase(Build.MODEL);
    }

    public static final C13212e subscription(C17485e c17485e, C17221e c17221e) {
        int i = c17485e.f34254e;
        if ((i & 8) == 8) {
            return c17485e.f34277e;
        }
        if ((i & 16) == 16) {
            return c17221e.ad(c17485e.f34265e);
        }
        throw new IllegalStateException("No returnType in ProtoBuf.Property");
    }

    public static final List vip(C2009e c2009e, C17221e c17221e) {
        List list = c2009e.f5259e;
        if (list.isEmpty()) {
            list = null;
        }
        if (list == null) {
            List list2 = c2009e.f5264e;
            list = new ArrayList(AbstractC0746e.subscription(list2, 10));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                list.add(c17221e.ad(((Integer) it.next()).intValue()));
            }
        }
        return list;
    }

    public static boolean yandex() {
        return (AbstractC6507e.loadAd(Build.MANUFACTURER, "Itel", true) || AbstractC6507e.loadAd(Build.BRAND, "Itel", true)) && "itel w6004".equalsIgnoreCase(Build.MODEL);
    }
}
