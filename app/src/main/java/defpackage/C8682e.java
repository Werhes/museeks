package defpackage;

import bruhcollective.itaysonlab.libvkmusic.methods.uma.GetPersonalRadio$Preapi;
import bruhcollective.itaysonlab.libvkmusic.objects.RadioCluster;
import bruhcollective.itaysonlab.libvkmusic.objects.RadioInfo;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌٔؑ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8682e extends AbstractC1792e {
    @Override // defpackage.AbstractC1792e
    public final String ad() {
        return "uma_personal";
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof C8682e);
    }

    public final int hashCode() {
        return 0;
    }

    @Override // defpackage.AbstractC1792e
    public final String license(RadioInfo radioInfo) {
        String str;
        RadioCluster radioCluster = radioInfo.metrica;
        return (radioCluster == null || (str = radioCluster.appmetrica) == null) ? "VK Mix" : str;
    }

    @Override // defpackage.AbstractC1792e
    public final String metrica() {
        return "/radio/personal/";
    }

    public final String toString() {
        return "Personal(clusterId=null)";
    }

    @Override // defpackage.AbstractC1792e
    public final AbstractC16234e vip() {
        return new AbstractC16234e(GetPersonalRadio$Preapi.class, "/radio/personal/");
    }
}
