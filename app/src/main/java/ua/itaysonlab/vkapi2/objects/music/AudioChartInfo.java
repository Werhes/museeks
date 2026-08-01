package ua.itaysonlab.vkapi2.objects.music;

import defpackage.AbstractC18039e;
import defpackage.AbstractC5756e;
import defpackage.C10230e;
import defpackage.C15937e;
import defpackage.C1630e;
import defpackage.C7204e;
import defpackage.C9283e;
import defpackage.EnumC11609e;
import defpackage.InterfaceC3477e;
import defpackage.InterfaceC3919e;
import defpackage.InterfaceC5413e;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@InterfaceC3919e(generateAdapter = true)
@InterfaceC5413e
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lua/itaysonlab/vkapi2/objects/music/AudioChartInfo;", BuildConfig.FLAVOR, "Companion", "eًِۗ", "eؚٗؓ", "eَِْ", "app_publicReleaseRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class AudioChartInfo {
    public static final C10230e Companion = new Object();
    public static final InterfaceC3477e[] license = {null, null, AbstractC18039e.appmetrica(2, new C9283e(23))};
    public final int ad;
    public final transient EnumC11609e metrica;
    public final int vip;

    public AudioChartInfo(int i, int i2) {
        Object obj;
        this.ad = i;
        this.vip = i2;
        C15937e c15937e = EnumC11609e.f23321e;
        c15937e.getClass();
        C1630e c1630e = new C1630e(0, c15937e);
        while (true) {
            if (!c1630e.hasNext()) {
                obj = null;
                break;
            } else {
                obj = c1630e.next();
                if (((EnumC11609e) obj).f23324e == this.vip) {
                    break;
                }
            }
        }
        EnumC11609e enumC11609e = (EnumC11609e) obj;
        this.metrica = enumC11609e == null ? EnumC11609e.f23320e : enumC11609e;
    }

    public AudioChartInfo(int i, int i2, int i3, EnumC11609e enumC11609e) {
        Object obj = null;
        if (1 != (i & 1)) {
            AbstractC5756e.billing(i, 1, C7204e.ad.appmetrica());
            throw null;
        }
        this.ad = i2;
        if ((i & 2) == 0) {
            this.vip = -1;
        } else {
            this.vip = i3;
        }
        if ((i & 4) != 0) {
            this.metrica = enumC11609e;
            return;
        }
        C15937e c15937e = EnumC11609e.f23321e;
        c15937e.getClass();
        C1630e c1630e = new C1630e(0, c15937e);
        while (true) {
            if (!c1630e.hasNext()) {
                break;
            }
            Object next = c1630e.next();
            if (((EnumC11609e) next).f23324e == this.vip) {
                obj = next;
                break;
            }
        }
        EnumC11609e enumC11609e2 = (EnumC11609e) obj;
        this.metrica = enumC11609e2 == null ? EnumC11609e.f23320e : enumC11609e2;
    }
}
