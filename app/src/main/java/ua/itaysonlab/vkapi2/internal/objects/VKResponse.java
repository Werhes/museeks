package ua.itaysonlab.vkapi2.internal.objects;

import defpackage.InterfaceC3919e;
import java.util.List;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@InterfaceC3919e(generateAdapter = true)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lua/itaysonlab/vkapi2/internal/objects/VKResponse;", "T", BuildConfig.FLAVOR, "app_publicReleaseRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class VKResponse<T> {
    public final Object ad;
    public final List metrica;
    public final VKError vip;

    public VKResponse(Object obj, VKError vKError, List list) {
        this.ad = obj;
        this.vip = vKError;
        this.metrica = list;
    }
}
