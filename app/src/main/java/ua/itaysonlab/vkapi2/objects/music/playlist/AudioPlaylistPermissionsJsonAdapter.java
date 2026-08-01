package ua.itaysonlab.vkapi2.objects.music.playlist;

import defpackage.AbstractC0869e;
import defpackage.AbstractC13345e;
import defpackage.AbstractC13480e;
import defpackage.AbstractC17080e;
import defpackage.AbstractC3442e;
import defpackage.AbstractC8647e;
import defpackage.C14172e;
import defpackage.C14803e;
import defpackage.C16911e;
import defpackage.C3295e;
import java.util.Set;
import kotlin.Metadata;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class AudioPlaylistPermissionsJsonAdapter extends AbstractC13345e {
    public final C16911e ad = C16911e.firebase("save_as_copy", "follow", "delete", "edit", "share", "play");
    public final AbstractC13345e vip;

    public AudioPlaylistPermissionsJsonAdapter(C14172e c14172e) {
        this.vip = c14172e.vip(Boolean.TYPE, C3295e.f7451e, "canClone");
    }

    @Override // defpackage.AbstractC13345e
    public final void purchase(AbstractC3442e abstractC3442e, Object obj) {
        if (obj == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        AudioPlaylistPermissions audioPlaylistPermissions = (AudioPlaylistPermissions) obj;
        abstractC3442e.license();
        abstractC3442e.loadAd("save_as_copy");
        boolean z = audioPlaylistPermissions.ad;
        AbstractC13345e abstractC13345e = this.vip;
        AbstractC8647e.m2459native(z, abstractC13345e, abstractC3442e, "follow");
        AbstractC8647e.m2459native(audioPlaylistPermissions.vip, abstractC13345e, abstractC3442e, "delete");
        AbstractC8647e.m2459native(audioPlaylistPermissions.metrica, abstractC13345e, abstractC3442e, "edit");
        AbstractC8647e.m2459native(audioPlaylistPermissions.license, abstractC13345e, abstractC3442e, "share");
        AbstractC8647e.m2459native(audioPlaylistPermissions.appmetrica, abstractC13345e, abstractC3442e, "play");
        abstractC13345e.purchase(abstractC3442e, Boolean.valueOf(audioPlaylistPermissions.purchase));
        abstractC3442e.purchase();
    }

    public final String toString() {
        return "GeneratedJsonAdapter(AudioPlaylistPermissions)";
    }

    @Override // defpackage.AbstractC13345e
    public final Object vip(AbstractC17080e abstractC17080e) {
        abstractC17080e.license();
        Set set = C3295e.f7451e;
        int i = -1;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = false;
        while (abstractC17080e.Signature()) {
            int mo2308extends = abstractC17080e.mo2308extends(this.ad);
            AbstractC13345e abstractC13345e = this.vip;
            switch (mo2308extends) {
                case -1:
                    abstractC17080e.mo2305break();
                    abstractC17080e.mo2314implements();
                    break;
                case 0:
                    Object vip = abstractC13345e.vip(abstractC17080e);
                    if (vip == null) {
                        set = AbstractC0869e.subs("canClone", "save_as_copy", abstractC17080e, set);
                    } else {
                        z = ((Boolean) vip).booleanValue();
                    }
                    i &= -2;
                    break;
                case 1:
                    Object vip2 = abstractC13345e.vip(abstractC17080e);
                    if (vip2 == null) {
                        set = AbstractC0869e.subs("canFollow", "follow", abstractC17080e, set);
                    } else {
                        z2 = ((Boolean) vip2).booleanValue();
                    }
                    i &= -3;
                    break;
                case 2:
                    Object vip3 = abstractC13345e.vip(abstractC17080e);
                    if (vip3 == null) {
                        set = AbstractC0869e.subs("canDelete", "delete", abstractC17080e, set);
                    } else {
                        z3 = ((Boolean) vip3).booleanValue();
                    }
                    i &= -5;
                    break;
                case 3:
                    Object vip4 = abstractC13345e.vip(abstractC17080e);
                    if (vip4 == null) {
                        set = AbstractC0869e.subs("canEdit", "edit", abstractC17080e, set);
                    } else {
                        z4 = ((Boolean) vip4).booleanValue();
                    }
                    i &= -9;
                    break;
                case 4:
                    Object vip5 = abstractC13345e.vip(abstractC17080e);
                    if (vip5 == null) {
                        set = AbstractC0869e.subs("canShare", "share", abstractC17080e, set);
                    } else {
                        z5 = ((Boolean) vip5).booleanValue();
                    }
                    i &= -17;
                    break;
                case 5:
                    Object vip6 = abstractC13345e.vip(abstractC17080e);
                    if (vip6 == null) {
                        set = AbstractC0869e.subs("canPlay", "play", abstractC17080e, set);
                    } else {
                        z6 = ((Boolean) vip6).booleanValue();
                    }
                    i &= -33;
                    break;
            }
        }
        abstractC17080e.advert();
        if (set.size() != 0) {
            throw new C14803e(AbstractC13480e.m3608try(set, "\n", null, null, null, 62), 8, (byte) 0);
        }
        if (i == -64) {
            return new AudioPlaylistPermissions(z, z2, z3, z4, z5, z6);
        }
        boolean z7 = (i & 1) != 0 ? false : z;
        if ((i & 2) != 0) {
            z2 = true;
        }
        return new AudioPlaylistPermissions(z7, z2, (i & 4) != 0 ? false : z3, (i & 8) != 0 ? false : z4, (i & 16) != 0 ? false : z5, (i & 32) != 0 ? false : z6);
    }
}
