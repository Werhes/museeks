package defpackage;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.graphics.Typeface;
import android.util.TypedValue;
import android.view.animation.AnimationUtils;
import android.view.animation.PathInterpolator;
import java.util.ArrayDeque;
import java.util.Iterator;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eۖؖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC18292e {
    public final /* synthetic */ int ad;
    public static final C2892e vip = new C2892e(573934858, false, new C13060e(23));
    public static final C2892e metrica = new C2892e(1597553195, false, new C13060e(24));

    public /* synthetic */ AbstractC18292e(int i) {
        this.ad = i;
    }

    public static float ad(int i, String[] strArr) {
        float parseFloat = Float.parseFloat(strArr[i]);
        if (parseFloat >= 0.0f && parseFloat <= 1.0f) {
            return parseFloat;
        }
        throw new IllegalArgumentException("Motion easing control point value must be between 0 and 1; instead got: " + parseFloat);
    }

    public static boolean appmetrica(String str, String str2) {
        return str.startsWith(str2.concat("(")) && str.endsWith(")");
    }

    public static boolean license(C17611e c17611e, InterfaceC14822e interfaceC14822e, InterfaceC10269e interfaceC10269e) {
        InterfaceC5876e interfaceC5876e = c17611e.metrica;
        if (interfaceC5876e.applovin(interfaceC14822e)) {
            return true;
        }
        if (interfaceC5876e.mo1260e(interfaceC14822e)) {
            return false;
        }
        if (c17611e.vip) {
            interfaceC5876e.mo1280super(interfaceC14822e);
        }
        return interfaceC5876e.mo1277return(interfaceC5876e.mo1272native(interfaceC14822e), interfaceC10269e);
    }

    public static boolean metrica(C17611e c17611e, InterfaceC14822e interfaceC14822e, AbstractC0181e abstractC0181e) {
        C11803e c11803e = C11803e.adcel;
        InterfaceC5876e interfaceC5876e = c17611e.metrica;
        if ((interfaceC5876e.ads(interfaceC14822e) && !interfaceC5876e.mo1260e(interfaceC14822e)) || interfaceC5876e.mo1233abstract(interfaceC14822e)) {
            return true;
        }
        c17611e.vip();
        ArrayDeque arrayDeque = c17611e.billing;
        C7495e c7495e = c17611e.yandex;
        arrayDeque.push(interfaceC14822e);
        while (!arrayDeque.isEmpty()) {
            InterfaceC14822e interfaceC14822e2 = (InterfaceC14822e) arrayDeque.pop();
            if (c7495e.add(interfaceC14822e2)) {
                AbstractC0181e abstractC0181e2 = interfaceC5876e.mo1260e(interfaceC14822e2) ? c11803e : abstractC0181e;
                if (abstractC0181e2.equals(c11803e)) {
                    abstractC0181e2 = null;
                }
                if (abstractC0181e2 == null) {
                    continue;
                } else {
                    Iterator it = interfaceC5876e.mo1271interface(interfaceC5876e.mo1272native(interfaceC14822e2)).iterator();
                    while (it.hasNext()) {
                        InterfaceC14822e license = abstractC0181e2.license(c17611e, (InterfaceC9905e) it.next());
                        if ((interfaceC5876e.ads(license) && !interfaceC5876e.mo1260e(license)) || interfaceC5876e.mo1233abstract(license)) {
                            c17611e.ad();
                            return true;
                        }
                        arrayDeque.add(license);
                    }
                }
            }
        }
        c17611e.ad();
        return false;
    }

    public static TimeInterpolator startapp(Context context, int i, TimeInterpolator timeInterpolator) {
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(i, typedValue, true)) {
            return timeInterpolator;
        }
        if (typedValue.type != 3) {
            throw new IllegalArgumentException("Motion easing theme attribute must be an @interpolator resource for ?attr/motionEasing*Interpolator attributes or a string for ?attr/motionEasing* attributes.");
        }
        String valueOf = String.valueOf(typedValue.string);
        if (!appmetrica(valueOf, "cubic-bezier") && !appmetrica(valueOf, "path")) {
            return AnimationUtils.loadInterpolator(context, typedValue.resourceId);
        }
        if (!appmetrica(valueOf, "cubic-bezier")) {
            if (appmetrica(valueOf, "path")) {
                return new PathInterpolator(AbstractC18491e.appmetrica(valueOf.substring(5, valueOf.length() - 1)));
            }
            throw new IllegalArgumentException("Invalid motion easing type: ".concat(valueOf));
        }
        String[] split = valueOf.substring(13, valueOf.length() - 1).split(",");
        if (split.length == 4) {
            return new PathInterpolator(ad(0, split), ad(1, split), ad(2, split), ad(3, split));
        }
        throw new IllegalArgumentException("Motion easing theme attribute must have 4 control points if using bezier curve format; instead got: " + split.length);
    }

    public static int yandex(Context context, int i, int i2) {
        TypedValue smaato = AbstractC9476e.smaato(context, i);
        return (smaato == null || smaato.type != 16) ? i2 : smaato.data;
    }

    public abstract void billing(Typeface typeface, boolean z);

    public abstract void purchase(int i);

    public String toString() {
        switch (this.ad) {
            case 3:
                return vip();
            default:
                return super.toString();
        }
    }

    public abstract String vip();
}
