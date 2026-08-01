package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.text.InputFilter;
import android.text.method.TransformationMethod;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eّٖؓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC15946e {
    public static final C2892e ad = new C2892e(-1123739605, false, new C14866e(14));
    public static final C2892e vip = new C2892e(-456357715, false, new C14866e(15));
    public static final C2892e metrica = new C2892e(1458417266, false, new C12341e(3));
    public static final C2892e license = new C2892e(-1988739065, false, new C12341e(4));
    public static final C2892e appmetrica = new C2892e(-1096714409, false, new C12341e(5));
    public static final C2892e purchase = new C2892e(307154777, false, new C12341e(6));
    public static final C2892e billing = new C2892e(1711023963, false, new C12341e(7));
    public static final C2892e yandex = new C2892e(1229754159, false, new C12341e(8));
    public static final C2892e startapp = new C2892e(-86295634, false, new C12341e(9));

    public static final void ad(C13770e c13770e, int i) {
        c13770e.m3671package(394881784);
        if (c13770e.m3673protected(i & 1, i != 0)) {
            Context context = (Context) c13770e.adcel(AbstractC2676e.vip);
            Unit unit = Unit.INSTANCE;
            boolean yandex2 = c13770e.yandex(context);
            Object m3681throw = c13770e.m3681throw();
            if (yandex2 || m3681throw == C2987e.ad) {
                m3681throw = new C5687e(context, 0);
                c13770e.m3682throws(m3681throw);
            }
            AbstractC17680e.vip(unit, (Function1) m3681throw, c13770e);
        } else {
            c13770e.m3659default();
        }
        C2846e subscription = c13770e.subscription();
        if (subscription != null) {
            subscription.license = new C8171e(i, 1);
        }
    }

    public static final Activity appmetrica(Context context) {
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (context instanceof ContextWrapper) {
            return appmetrica(((ContextWrapper) context).getBaseContext());
        }
        return null;
    }

    public static String license(AbstractC4002e abstractC4002e) {
        StringBuilder sb = new StringBuilder(abstractC4002e.size());
        for (int i = 0; i < abstractC4002e.size(); i++) {
            byte appmetrica2 = abstractC4002e.appmetrica(i);
            if (appmetrica2 == 34) {
                sb.append("\\\"");
            } else if (appmetrica2 == 39) {
                sb.append("\\'");
            } else if (appmetrica2 != 92) {
                switch (appmetrica2) {
                    case 7:
                        sb.append("\\a");
                        break;
                    case 8:
                        sb.append("\\b");
                        break;
                    case 9:
                        sb.append("\\t");
                        break;
                    case 10:
                        sb.append("\\n");
                        break;
                    case 11:
                        sb.append("\\v");
                        break;
                    case 12:
                        sb.append("\\f");
                        break;
                    case 13:
                        sb.append("\\r");
                        break;
                    default:
                        if (appmetrica2 < 32 || appmetrica2 > 126) {
                            sb.append('\\');
                            sb.append((char) (((appmetrica2 >>> 6) & 3) + 48));
                            sb.append((char) (((appmetrica2 >>> 3) & 7) + 48));
                            sb.append((char) ((appmetrica2 & 7) + 48));
                            break;
                        } else {
                            sb.append((char) appmetrica2);
                            break;
                        }
                        break;
                }
            } else {
                sb.append("\\\\");
            }
        }
        return sb.toString();
    }

    public static void metrica(int i, long[] jArr, long[] jArr2) {
        jArr2[i] = jArr[0];
        jArr2[i + 1] = jArr[1];
        jArr2[i + 2] = jArr[2];
        jArr2[i + 3] = jArr[3];
        jArr2[i + 4] = jArr[4];
    }

    public static final void vip(C13770e c13770e, int i) {
        c13770e.m3671package(193502176);
        if (c13770e.m3673protected(i & 1, (i & 3) != 2)) {
            Context context = (Context) c13770e.adcel(AbstractC2676e.vip);
            boolean yandex2 = c13770e.yandex(context);
            Object m3681throw = c13770e.m3681throw();
            if (yandex2 || m3681throw == C2987e.ad) {
                m3681throw = new C5687e(context, 1);
                c13770e.m3682throws(m3681throw);
            }
            AbstractC17680e.vip(1, (Function1) m3681throw, c13770e);
        } else {
            c13770e.m3659default();
        }
        C2846e subscription = c13770e.subscription();
        if (subscription != null) {
            subscription.license = new C8171e(i, 2);
        }
    }

    public abstract TransformationMethod adcel(TransformationMethod transformationMethod);

    public abstract boolean billing();

    public abstract InputFilter[] purchase(InputFilter[] inputFilterArr);

    public abstract void startapp(boolean z);

    public abstract void yandex(boolean z);
}
