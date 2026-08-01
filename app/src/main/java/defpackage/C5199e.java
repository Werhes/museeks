package defpackage;

import androidx.car.app.navigation.model.Maneuver;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import java.util.regex.Matcher;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؗ۠ۛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5199e implements InterfaceC1624e {
    public final /* synthetic */ int ad;

    public /* synthetic */ C5199e() {
        this.ad = 14;
    }

    public /* synthetic */ C5199e(InterfaceC13403e interfaceC13403e, int i) {
        this.ad = i;
    }

    @Override // defpackage.InterfaceC1624e
    public final void ad(C0700e c0700e, Object obj, C4052e c4052e) {
        switch (this.ad) {
            case 0:
                C9168e c9168e = (C9168e) obj;
                String str = c0700e.vip;
                try {
                    c9168e.ad = Float.parseFloat(str);
                    return;
                } catch (NumberFormatException unused) {
                    throw C15608e.ad("EXT-X-START", 33, str);
                }
            case 1:
                ((C9168e) obj).vip = AbstractC0815e.remoteconfig(c0700e, "EXT-X-START");
                return;
            case 2:
                C16608e c16608e = (C16608e) obj;
                String subscription = AbstractC0815e.subscription(c0700e.vip, "EXT-X-MEDIA");
                if (!AbstractC16316e.adcel.matcher(subscription).matches()) {
                    throw C15608e.ad("EXT-X-MEDIA", 15, c0700e.toString());
                }
                c16608e.adcel = subscription;
                return;
            case 3:
                C16608e c16608e2 = (C16608e) obj;
                String[] split = AbstractC0815e.subscription(c0700e.vip, "EXT-X-MEDIA").split(AbstractC16316e.ad);
                if (split.length == 0) {
                    throw C15608e.ad("EXT-X-MEDIA", 4, c0700e.toString());
                }
                c16608e2.mopub = Arrays.asList(split);
                return;
            case 4:
                C16608e c16608e3 = (C16608e) obj;
                String[] split2 = AbstractC0815e.subscription(c0700e.vip, "EXT-X-MEDIA").split("/");
                if (split2.length == 0 || split2[0].isEmpty()) {
                    throw C15608e.ad("EXT-X-MEDIA", 3, c0700e.toString());
                }
                c16608e3.advert = AbstractC0815e.admob(split2[0], "EXT-X-MEDIA");
                return;
            case 5:
                C16608e c16608e4 = (C16608e) obj;
                EnumC15030e enumC15030e = (EnumC15030e) EnumC15030e.f29798e.get(c0700e.vip);
                if (enumC15030e == null) {
                    throw C15608e.ad("EXT-X-MEDIA", 16, c0700e.toString());
                }
                c16608e4.ad = enumC15030e;
                return;
            case 6:
                ((C16608e) obj).vip = AbstractC0815e.startapp(AbstractC0815e.subscription(c0700e.vip, "EXT-X-MEDIA"), (EnumC11433e) c4052e.f9000e);
                return;
            case 7:
                C16608e c16608e5 = (C16608e) obj;
                String subscription2 = AbstractC0815e.subscription(c0700e.vip, "EXT-X-MEDIA");
                if (subscription2.isEmpty()) {
                    throw C15608e.ad("EXT-X-MEDIA", 5, c0700e.toString());
                }
                c16608e5.metrica = subscription2;
                return;
            case 8:
                ((C16608e) obj).license = AbstractC0815e.subscription(c0700e.vip, "EXT-X-MEDIA");
                return;
            case 9:
                ((C16608e) obj).appmetrica = AbstractC0815e.subscription(c0700e.vip, "EXT-X-MEDIA");
                return;
            case 10:
                C16608e c16608e6 = (C16608e) obj;
                String subscription3 = AbstractC0815e.subscription(c0700e.vip, "EXT-X-MEDIA");
                if (subscription3.isEmpty()) {
                    throw C15608e.ad("EXT-X-MEDIA", 6, c0700e.toString());
                }
                c16608e6.purchase = subscription3;
                return;
            case 11:
                C16608e c16608e7 = (C16608e) obj;
                boolean remoteconfig = AbstractC0815e.remoteconfig(c0700e, "EXT-X-MEDIA");
                c16608e7.billing = remoteconfig;
                C14341e c14341e = (C14341e) c4052e.f8999e;
                c14341e.f28371e = remoteconfig;
                if (remoteconfig) {
                    if (c14341e.f28368e) {
                        throw C15608e.ad("EXT-X-MEDIA", 1, c0700e.toString());
                    }
                    c16608e7.yandex = true;
                    return;
                }
                return;
            case 12:
                boolean remoteconfig2 = AbstractC0815e.remoteconfig(c0700e, "EXT-X-MEDIA");
                ((C16608e) obj).yandex = remoteconfig2;
                C14341e c14341e2 = (C14341e) c4052e.f8999e;
                c14341e2.f28368e = !remoteconfig2;
                if (c14341e2.f28371e && !remoteconfig2) {
                    throw C15608e.ad("EXT-X-MEDIA", 1, c0700e.toString());
                }
                return;
            case 13:
                ((C16608e) obj).startapp = AbstractC0815e.remoteconfig(c0700e, "EXT-X-MEDIA");
                return;
            case 14:
                return;
            case 15:
                ((C16197e) obj).billing = AbstractC0815e.subscription(c0700e.vip, "EXT-X-I-FRAME-STREAM-INF");
                return;
            case 16:
                ((C16778e) obj).purchase = AbstractC0815e.subscription(c0700e.vip, "EXT-X-STREAM-INF");
                return;
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                ((C16778e) obj).yandex = AbstractC0815e.subscription(c0700e.vip, "EXT-X-STREAM-INF");
                return;
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                C16778e c16778e = (C16778e) obj;
                String str2 = c0700e.vip;
                if (str2.equals("NONE")) {
                    return;
                }
                c16778e.startapp = AbstractC0815e.subscription(str2, "EXT-X-STREAM-INF");
                return;
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                C3633e c3633e = (C3633e) obj;
                EnumC10061e enumC10061e = (EnumC10061e) EnumC10061e.f19873e.get(c0700e.vip);
                if (enumC10061e == null) {
                    throw C15608e.ad("EXT-X-KEY", 11, c0700e.toString());
                }
                c3633e.ad = enumC10061e;
                return;
            case 20:
                ((C3633e) obj).vip = AbstractC0815e.startapp(AbstractC0815e.subscription(c0700e.vip, "EXT-X-KEY"), (EnumC11433e) c4052e.f9000e);
                return;
            case 21:
                C3633e c3633e2 = (C3633e) obj;
                String str3 = c0700e.vip;
                ArrayList arrayList = new ArrayList();
                Matcher matcher = AbstractC16316e.metrica.matcher(str3.toUpperCase(Locale.US));
                if (!matcher.matches()) {
                    throw C15608e.ad("EXT-X-KEY", 12, str3);
                }
                String group = matcher.group(1);
                if (group.length() % 2 != 0) {
                    throw C15608e.ad("EXT-X-KEY", 12, str3);
                }
                int i = 0;
                while (i < group.length()) {
                    int i2 = i + 2;
                    arrayList.add(Byte.valueOf((byte) (Short.parseShort(group.substring(i, i2), 16) & 255)));
                    i = i2;
                }
                if (arrayList.size() != 16 && arrayList.size() != 32) {
                    throw C15608e.ad("EXT-X-KEY", 13, c0700e.toString());
                }
                c3633e2.metrica = arrayList;
                return;
            case 22:
                ((C3633e) obj).license = AbstractC0815e.subscription(c0700e.vip, "EXT-X-KEY");
                return;
            case 23:
                C3633e c3633e3 = (C3633e) obj;
                String[] split3 = AbstractC0815e.subscription(c0700e.vip, "EXT-X-KEY").split("/");
                ArrayList arrayList2 = new ArrayList();
                for (String str4 : split3) {
                    try {
                        arrayList2.add(Integer.valueOf(Integer.parseInt(str4)));
                    } catch (NumberFormatException unused2) {
                        throw C15608e.ad("EXT-X-KEY", 14, c0700e.toString());
                    }
                }
                c3633e3.appmetrica = arrayList2;
                return;
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                ((C12239e) obj).ad = AbstractC0815e.startapp(AbstractC0815e.subscription(c0700e.vip, "EXT-X-MAP"), (EnumC11433e) c4052e.f9000e);
                return;
            case Maneuver.TYPE_FORK_LEFT /* 25 */:
                C12239e c12239e = (C12239e) obj;
                Matcher matcher2 = AbstractC16316e.Signature.matcher(AbstractC0815e.subscription(c0700e.vip, "EXT-X-MAP"));
                if (!matcher2.matches()) {
                    throw C15608e.ad("EXT-X-MAP", 20, c0700e.toString());
                }
                c12239e.vip = AbstractC0815e.smaato(matcher2);
                return;
            case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                C9168e c9168e2 = (C9168e) obj;
                String str5 = c0700e.vip;
                try {
                    c9168e2.ad = Float.parseFloat(str5);
                    return;
                } catch (NumberFormatException unused3) {
                    throw C15608e.ad("EXT-X-START", 33, str5);
                }
            default:
                ((C9168e) obj).vip = AbstractC0815e.remoteconfig(c0700e, "EXT-X-START");
                return;
        }
    }
}
