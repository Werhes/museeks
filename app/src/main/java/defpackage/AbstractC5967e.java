package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.conscrypt.PSKKeyManager;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘۡٞ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC5967e {

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f12571e = 5;

    public static final C9137e appmetrica(C13770e c13770e) {
        Object[] objArr = new Object[0];
        boolean license = c13770e.license(0);
        Object m3681throw = c13770e.m3681throw();
        if (license || m3681throw == C2987e.ad) {
            m3681throw = new C10673e(8);
            c13770e.m3682throws(m3681throw);
        }
        return (C9137e) AbstractC10510e.appmetrica(objArr, C9137e.adcel, (Function0) m3681throw, c13770e, 0);
    }

    public static final AbstractC9936e billing(C13213e c13213e, int i) {
        Object obj;
        Iterator<T> it = c13213e.getLayoutNodeToHolder().entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((C13915e) ((Map.Entry) obj).getKey()).f27594e == i) {
                break;
            }
        }
        Map.Entry entry = (Map.Entry) obj;
        if (entry != null) {
            return (AbstractC9936e) entry.getValue();
        }
        return null;
    }

    public static final C12476e license(C0500e c0500e) {
        Function1 function1;
        ArrayList arrayList = new ArrayList();
        Object billing = c0500e.f2578e.billing(AbstractC10789e.ad);
        if (billing == null) {
            billing = null;
        }
        C10591e c10591e = (C10591e) billing;
        if (c10591e == null || (function1 = (Function1) c10591e.vip) == null || !((Boolean) function1.invoke(arrayList)).booleanValue()) {
            return null;
        }
        return (C12476e) arrayList.get(0);
    }

    public static final float metrica(long j, long j2) {
        return Math.min(Float.intBitsToFloat((int) (j2 >> 32)) / Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j2 & 4294967295L)) / Float.intBitsToFloat((int) (j & 4294967295L)));
    }

    public static InterfaceC12864e purchase(InterfaceC12864e interfaceC12864e, C9137e c9137e, boolean z) {
        EnumC17426e enumC17426e = EnumC17426e.f34146e;
        EnumC17426e enumC17426e2 = z ? enumC17426e : EnumC17426e.f34145e;
        C15274e c15274e = c9137e.license;
        float f = AbstractC6461e.ad;
        C0115e c0115e = C0115e.f1276e;
        return interfaceC12864e.premium(enumC17426e2 == enumC17426e ? AbstractC12447e.vip(c0115e, C5100e.metrica) : AbstractC12447e.vip(c0115e, C5100e.vip)).premium(new C11169e(null, null, null, c15274e, enumC17426e2, c9137e, true, true)).premium(new C10491e(c9137e, z));
    }

    public static final void vip(Object obj, int i, C4695e c4695e, C2892e c2892e, C13770e c13770e, int i2) {
        int i3;
        c13770e.m3671package(872548579);
        if ((i2 & 6) == 0) {
            i3 = (c13770e.yandex(obj) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= c13770e.license(i) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= c13770e.yandex(c4695e) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= c13770e.yandex(c2892e) ? 2048 : 1024;
        }
        if (c13770e.m3673protected(i3 & 1, (i3 & 1171) != 1170)) {
            boolean purchase = c13770e.purchase(obj) | c13770e.purchase(c4695e);
            Object m3681throw = c13770e.m3681throw();
            Object obj2 = C2987e.ad;
            if (purchase || m3681throw == obj2) {
                m3681throw = new C8258e(obj, c4695e);
                c13770e.m3682throws(m3681throw);
            }
            C8258e c8258e = (C8258e) m3681throw;
            c8258e.metrica = i;
            C0576e c0576e = c8258e.billing;
            AbstractC4455e abstractC4455e = AbstractC5319e.ad;
            C8258e c8258e2 = (C8258e) c13770e.adcel(abstractC4455e);
            AbstractC13717e adcel = AbstractC12640e.adcel();
            Function1 appmetrica = adcel != null ? adcel.appmetrica() : null;
            AbstractC13717e smaato = AbstractC12640e.smaato(adcel);
            try {
                if (c8258e2 != ((C8258e) c0576e.getValue())) {
                    c0576e.setValue(c8258e2);
                    if (c8258e.license > 0) {
                        C8258e c8258e3 = c8258e.appmetrica;
                        if (c8258e3 != null) {
                            c8258e3.vip();
                        }
                        if (c8258e2 != null) {
                            c8258e2.ad();
                        } else {
                            c8258e2 = null;
                        }
                        c8258e.appmetrica = c8258e2;
                    }
                }
                Unit unit = Unit.INSTANCE;
                AbstractC12640e.Signature(adcel, smaato, appmetrica);
                boolean purchase2 = c13770e.purchase(c8258e);
                Object m3681throw2 = c13770e.m3681throw();
                if (purchase2 || m3681throw2 == obj2) {
                    m3681throw2 = new C2109e(22, c8258e);
                    c13770e.m3682throws(m3681throw2);
                }
                AbstractC17680e.vip(c8258e, (Function1) m3681throw2, c13770e);
                AbstractC1101e.ad(abstractC4455e.ad(c8258e), c2892e, c13770e, ((i3 >> 6) & 112) | 8);
            } catch (Throwable th) {
                AbstractC12640e.Signature(adcel, smaato, appmetrica);
                throw th;
            }
        } else {
            c13770e.m3659default();
        }
        C2846e subscription = c13770e.subscription();
        if (subscription != null) {
            subscription.license = new C4880e(i, i2, 3, obj, c4695e, c2892e);
        }
    }

    public static final String yandex(int i) {
        if (i == 0) {
            return "android.widget.Button";
        }
        if (i == 1) {
            return "android.widget.CheckBox";
        }
        if (i == 3) {
            return "android.widget.RadioButton";
        }
        if (i == 5) {
            return "android.widget.ImageView";
        }
        if (i == 6) {
            return "android.widget.Spinner";
        }
        if (i == 7) {
            return "android.widget.NumberPicker";
        }
        return null;
    }

    public String toString() {
        switch (this.f12571e) {
            case 5:
                return ((ScheduledFutureC11729e) this).f23570e.toString();
            default:
                return super.toString();
        }
    }
}
