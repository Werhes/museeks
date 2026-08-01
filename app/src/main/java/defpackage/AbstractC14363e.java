package defpackage;

import java.util.UUID;
import org.conscrypt.BuildConfig;
import ua.itaysonlab.catalogkit.objects.Catalog2Response;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٓۥؓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC14363e extends AbstractC18406e {
    public final String billing;
    public final String purchase;

    public AbstractC14363e() {
        super(Catalog2Response.class);
        this.purchase = "vkxSynth";
        this.billing = "offlineRequest";
    }

    public static String pro() {
        return AbstractC6507e.subscription(UUID.randomUUID().toString(), "-", BuildConfig.FLAVOR, false);
    }

    @Override // defpackage.AbstractC18406e
    public final String adcel() {
        return this.purchase;
    }

    @Override // defpackage.AbstractC18406e
    public final Object billing(AbstractC10731e abstractC10731e) {
        return remoteconfig(abstractC10731e);
    }

    @Override // defpackage.AbstractC18406e
    public final String mopub() {
        return this.billing;
    }

    public abstract Object remoteconfig(AbstractC10731e abstractC10731e);
}
