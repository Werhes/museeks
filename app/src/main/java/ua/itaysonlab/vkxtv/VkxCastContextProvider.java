package com.werhes.museekstv;

import android.content.Context;
import defpackage.AbstractC15792e;
import defpackage.C0353e;
import defpackage.C12118e;
import defpackage.C12487e;
import defpackage.C4941e;
import defpackage.C5363e;
import defpackage.C9753e;
import defpackage.InterfaceC17867e;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\u000b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\n\u0018\u00010\t2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lua/itaysonlab/vkxtv/VkxCastContextProvider;", "Leۣ٘ٛ;", "<init>", "()V", "Landroid/content/Context;", "p0", "Leؘّٕ;", "getCastOptions", "(Landroid/content/Context;)Leؘّٕ;", BuildConfig.FLAVOR, "Leِۦۖ;", "getAdditionalSessionProviders", "(Landroid/content/Context;)Ljava/util/List;", "app_publicReleaseRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final class VkxCastContextProvider implements InterfaceC17867e {
    @Override // defpackage.InterfaceC17867e
    public List<C12118e> getAdditionalSessionProviders(Context p0) {
        return null;
    }

    @Override // defpackage.InterfaceC17867e
    public C12487e getCastOptions(Context p0) {
        ArrayList arrayList = new ArrayList();
        C9753e c9753e = new C9753e();
        ArrayList arrayList2 = new ArrayList();
        C5363e c5363e = C0353e.startapp;
        String pro = AbstractC15792e.billing().yandex.pro();
        C4941e c4941e = C12487e.f24999e;
        if (c4941e != null) {
            return new C12487e(pro, arrayList, true, c9753e, false, c4941e, true, 0.05000000074505806d, false, false, false, arrayList2, false, false, C12487e.f25000e, C12487e.f25001e, false, false);
        }
        throw new NullPointerException("use Optional.orNull() instead of Optional.or(null)");
    }
}
