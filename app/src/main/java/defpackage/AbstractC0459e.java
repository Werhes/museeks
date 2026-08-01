package defpackage;

import bruhcollective.itaysonlab.libvkmusic.methods.uma.GetPersonalRadio$Preapi;
import bruhcollective.itaysonlab.libvkmusic.objects.RadioInfo;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٟؑٞ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0459e extends AbstractC1792e {
    public final String ad;
    public final Function1 metrica;
    public final String vip;

    public AbstractC0459e(String str, String str2, Function1 function1) {
        this.ad = str;
        this.vip = str2;
        this.metrica = function1;
    }

    @Override // defpackage.AbstractC1792e
    public final String ad() {
        return "uma_" + this.ad + ':' + this.vip;
    }

    @Override // defpackage.AbstractC1792e
    public final String license(RadioInfo radioInfo) {
        return (String) this.metrica.invoke(radioInfo);
    }

    @Override // defpackage.AbstractC1792e
    public final String metrica() {
        return "/radio/" + this.ad + '/' + this.vip;
    }

    @Override // defpackage.AbstractC1792e
    public final AbstractC16234e vip() {
        return new AbstractC16234e(GetPersonalRadio$Preapi.class, "/radio/" + this.ad + '/' + this.vip + '/');
    }
}
