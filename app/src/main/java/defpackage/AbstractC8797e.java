package defpackage;

import android.net.Uri;
import android.view.InputEvent;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌٌٛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC8797e {
    public static final C1032e advert;
    public static final C1032e[] amazon;
    public static final C1032e smaato;
    public static final C2892e ad = new C2892e(318520272, false, new C5029e(19));
    public static final C2892e vip = new C2892e(-1789468145, false, new C5029e(21));
    public static final C2892e metrica = new C2892e(-607226392, false, new C16015e(13));
    public static final C2892e license = new C2892e(449664445, false, new C5029e(22));
    public static final C2892e appmetrica = new C2892e(2034385792, false, new C5029e(23));
    public static final C2892e purchase = new C2892e(-203734240, false, new C16015e(14));
    public static final C2892e billing = new C2892e(1250596159, false, new C5029e(24));
    public static final C2892e yandex = new C2892e(-1459649790, false, new C5029e(25));
    public static final C2892e startapp = new C2892e(-496421632, false, new C5029e(26));
    public static final C2892e adcel = new C2892e(470097772, false, new C16015e(12));
    public static final C2892e mopub = new C2892e(-1669309435, false, new C5029e(20));

    static {
        C1032e c1032e = new C1032e(-1, 1L, "CLIENT_TELEMETRY", true);
        advert = c1032e;
        C1032e c1032e2 = new C1032e(-1, 1L, "CLIENT_NOTIFICATION_TELEMETRY", true);
        smaato = c1032e2;
        amazon = new C1032e[]{c1032e, c1032e2};
    }

    public static final int ad(CharSequence charSequence, int i) {
        int length = charSequence.length();
        while (i < length) {
            if (charSequence.charAt(i) == '\n') {
                return i;
            }
            i++;
        }
        return charSequence.length();
    }

    public static final InterfaceC5052e billing(InterfaceC5334e interfaceC5334e, C12816e c12816e) {
        InterfaceC8528e mo1730e;
        C13579e c13579e = c12816e.ad;
        if (!c13579e.metrica()) {
            C5266e c5266e = ((C14887e) interfaceC5334e.mo1886e(c12816e.vip())).f29499e;
            C0520e billing2 = c13579e.billing();
            EnumC2192e enumC2192e = EnumC2192e.f5578e;
            InterfaceC4077e appmetrica2 = c5266e.appmetrica(billing2, enumC2192e);
            InterfaceC5052e interfaceC5052e = appmetrica2 instanceof InterfaceC5052e ? (InterfaceC5052e) appmetrica2 : null;
            if (interfaceC5052e != null) {
                return interfaceC5052e;
            }
            InterfaceC5052e billing3 = billing(interfaceC5334e, c12816e.vip());
            InterfaceC4077e appmetrica3 = (billing3 == null || (mo1730e = billing3.mo1730e()) == null) ? null : mo1730e.appmetrica(c13579e.billing(), enumC2192e);
            if (appmetrica3 instanceof InterfaceC5052e) {
                return (InterfaceC5052e) appmetrica3;
            }
        }
        return null;
    }

    public static final InterfaceC4077e license(InterfaceC15498e interfaceC15498e) {
        InterfaceC15498e mo1351switch = interfaceC15498e.mo1351switch();
        if (mo1351switch == null || (interfaceC15498e instanceof InterfaceC9646e)) {
            return null;
        }
        if (!(mo1351switch.mo1351switch() instanceof InterfaceC9646e)) {
            return license(mo1351switch);
        }
        if (mo1351switch instanceof InterfaceC4077e) {
            return (InterfaceC4077e) mo1351switch;
        }
        return null;
    }

    public static final int vip(CharSequence charSequence, int i) {
        while (i > 0) {
            if (charSequence.charAt(i - 1) == '\n') {
                return i;
            }
            i--;
        }
        return 0;
    }

    public abstract Object appmetrica(Uri uri, InputEvent inputEvent, InterfaceC5083e interfaceC5083e);

    public abstract Object metrica(InterfaceC5083e interfaceC5083e);

    public abstract Object purchase(Uri uri, InterfaceC5083e interfaceC5083e);
}
