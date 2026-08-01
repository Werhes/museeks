package defpackage;

import android.content.SharedPreferences;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؚؔٞ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6898e extends AbstractC7185e implements Function3 {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final /* synthetic */ int f14138e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public /* synthetic */ C3487e f14139e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public /* synthetic */ C10282e f14140e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C6898e(int i, int i2, InterfaceC5083e interfaceC5083e) {
        super(i, interfaceC5083e);
        this.f14138e = i2;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        C10282e c10282e = (C10282e) obj;
        C3487e c3487e = (C3487e) obj2;
        InterfaceC5083e interfaceC5083e = (InterfaceC5083e) obj3;
        switch (this.f14138e) {
            case 0:
                C6898e c6898e = new C6898e(3, 0, interfaceC5083e);
                c6898e.f14140e = c10282e;
                c6898e.f14139e = c3487e;
                return c6898e.loadAd(Unit.INSTANCE);
            case 1:
                C6898e c6898e2 = new C6898e(3, 1, interfaceC5083e);
                c6898e2.f14140e = c10282e;
                c6898e2.f14139e = c3487e;
                return c6898e2.loadAd(Unit.INSTANCE);
            default:
                C6898e c6898e3 = new C6898e(3, 2, interfaceC5083e);
                c6898e3.f14140e = c10282e;
                c6898e3.f14139e = c3487e;
                return c6898e3.loadAd(Unit.INSTANCE);
        }
    }

    @Override // defpackage.AbstractC9049e
    public final Object loadAd(Object obj) {
        Integer signatures;
        Integer signatures2;
        Integer signatures3;
        Integer signatures4;
        String str;
        switch (this.f14138e) {
            case 0:
                C10282e c10282e = this.f14140e;
                C3487e c3487e = this.f14139e;
                AbstractC2003e.purchase(obj);
                SharedPreferences sharedPreferences = c10282e.ad;
                SharedPreferences sharedPreferences2 = c10282e.ad;
                c10282e.ad("interface_accent");
                String string = sharedPreferences.getString("interface_accent", "0");
                int intValue = (string == null || (signatures4 = AbstractC6507e.signatures(string)) == null) ? 0 : signatures4.intValue();
                c10282e.ad("interface_theme");
                String string2 = sharedPreferences2.getString("interface_theme", "2");
                int i = 2;
                int intValue2 = (string2 == null || (signatures3 = AbstractC6507e.signatures(string2)) == null) ? 2 : signatures3.intValue();
                c10282e.ad("theming_last_theme_dark");
                int i2 = sharedPreferences2.getInt("theming_last_theme_dark", 0);
                c10282e.ad("theming_last_theme_light");
                int i3 = 1;
                int i4 = sharedPreferences2.getInt("theming_last_theme_light", 1);
                c10282e.ad("interface_theme");
                String string3 = sharedPreferences2.getString("interface_theme", "2");
                if (string3 != null && (signatures2 = AbstractC6507e.signatures(string3)) != null) {
                    i = signatures2.intValue();
                }
                c10282e.ad("interface_theme");
                String string4 = sharedPreferences2.getString("interface_theme", "1");
                if (string4 != null && (signatures = AbstractC6507e.signatures(string4)) != null) {
                    i3 = signatures.intValue();
                }
                return C3487e.vip(c3487e, intValue, intValue2, i4, i3, i2, i, false, false, false, false, null, 0, false, 16320);
            case 1:
                C10282e c10282e2 = this.f14140e;
                C3487e c3487e2 = this.f14139e;
                AbstractC2003e.purchase(obj);
                return C3487e.vip(c3487e2, 0, 0, 0, 0, 0, 0, false, c10282e2.metrica("a12_monet", false), c10282e2.metrica("a12_monet", false), c10282e2.metrica("ct_override", false), null, 0, false, 15423);
            default:
                C10282e c10282e3 = this.f14140e;
                C3487e c3487e3 = this.f14139e;
                AbstractC2003e.purchase(obj);
                LinkedHashMap vip = c10282e3.vip();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Map.Entry entry : vip.entrySet()) {
                    if (AbstractC6507e.pro((String) entry.getKey(), "tco_", false)) {
                        linkedHashMap.put(entry.getKey(), entry.getValue());
                    }
                }
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(AbstractC10064e.appmetrica(linkedHashMap.size()));
                for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                    linkedHashMap2.put(AbstractC5304e.m1852case((String) entry2.getKey(), "tco_"), entry2.getValue());
                }
                LinkedHashMap linkedHashMap3 = new LinkedHashMap(AbstractC10064e.appmetrica(linkedHashMap2.size()));
                for (Map.Entry entry3 : linkedHashMap2.entrySet()) {
                    Object key = entry3.getKey();
                    Object value = entry3.getValue();
                    if (value == null || (str = value.toString()) == null) {
                        str = BuildConfig.FLAVOR;
                    }
                    linkedHashMap3.put(key, str);
                }
                return C3487e.vip(c3487e3, 0, 0, 0, 0, 0, 0, false, false, false, false, linkedHashMap3, 0, false, 15359);
        }
    }
}
