package defpackage;

import java.util.Collections;
import ua.itaysonlab.vkapi2.objects.radio.RadioStation;
import ua.itaysonlab.vkx.R;
import ua.itaysonlab.vkx.VKXApplication;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٕؑۢ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C15167e implements InterfaceC4079e {
    public final RadioStation ad;
    public final boolean metrica = true;
    public final String vip;

    public C15167e(RadioStation radioStation) {
        this.ad = radioStation;
        this.vip = "vk_radio_" + radioStation.ad;
    }

    @Override // defpackage.InterfaceC4079e
    public final Object ad(InterfaceC5083e interfaceC5083e) {
        return Collections.singletonList(this.ad);
    }

    @Override // defpackage.InterfaceC1686e
    public final String billing() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C15167e) && AbstractC7890e.billing(this.ad, ((C15167e) obj).ad);
    }

    @Override // defpackage.InterfaceC1686e
    public final String getId() {
        return this.vip;
    }

    public final int hashCode() {
        return this.ad.hashCode();
    }

    @Override // defpackage.InterfaceC1686e
    public final String metrica() {
        VKXApplication.Companion companion = VKXApplication.f36531e;
        VKXApplication vKXApplication = VKXApplication.f36528e;
        if (vKXApplication == null) {
            vKXApplication = null;
        }
        return vKXApplication.getString(R.string.op_radio_station);
    }

    @Override // defpackage.InterfaceC1686e
    public final boolean purchase() {
        return this.metrica;
    }

    public final String toString() {
        return "Station(station=" + this.ad + ')';
    }
}
