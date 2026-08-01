package defpackage;

import java.util.List;
import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٔؓۖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C14474e implements InterfaceC4079e {
    public final List ad;
    public final String vip;

    public C14474e(List list) {
        this.ad = list;
        this.vip = "passthrough_" + list.hashCode();
    }

    @Override // defpackage.InterfaceC4079e
    public final Object ad(InterfaceC5083e interfaceC5083e) {
        return this.ad;
    }

    @Override // defpackage.InterfaceC1686e
    public final String billing() {
        return null;
    }

    @Override // defpackage.InterfaceC1686e
    public final String getId() {
        return this.vip;
    }

    @Override // defpackage.InterfaceC1686e
    public final String metrica() {
        return BuildConfig.FLAVOR;
    }

    @Override // defpackage.InterfaceC1686e
    public final boolean purchase() {
        return false;
    }
}
