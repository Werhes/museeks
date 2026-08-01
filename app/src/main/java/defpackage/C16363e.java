package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٖٝؑ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C16363e extends AbstractC13828e {
    public final /* synthetic */ int mopub;

    public /* synthetic */ C16363e(int i) {
        this.mopub = i;
    }

    private final void purchase(C15816e c15816e, C2697e c2697e) {
    }

    @Override // defpackage.AbstractC13828e
    public final void appmetrica(C15816e c15816e, C2697e c2697e) {
        switch (this.mopub) {
            case 0:
                if (c2697e.purchase) {
                    return;
                }
                c15816e.m4017final("EXT-X-ENDLIST");
                return;
            case 1:
                if (c2697e.appmetrica) {
                    c15816e.m4017final("EXT-X-I-FRAMES-ONLY");
                    return;
                }
                return;
            case 2:
                EnumC3923e enumC3923e = c2697e.billing;
                if (enumC3923e != null) {
                    c15816e.m4022super("EXT-X-PLAYLIST-TYPE", enumC3923e.f8766e);
                    return;
                }
                return;
            case 3:
                c15816e.m4022super("EXT-X-TARGETDURATION", Integer.toString(c2697e.metrica));
                return;
            case 4:
                c15816e.m4022super("EXT-X-MEDIA-SEQUENCE", Integer.toString(c2697e.license));
                return;
            default:
                return;
        }
    }

    @Override // defpackage.AbstractC17001e
    public final boolean metrica() {
        switch (this.mopub) {
            case 0:
                return false;
            case 1:
                return false;
            case 2:
                return true;
            case 3:
                return true;
            case 4:
                return true;
            default:
                return true;
        }
    }

    @Override // defpackage.AbstractC17001e
    public final String vip() {
        switch (this.mopub) {
            case 0:
                return "EXT-X-ENDLIST";
            case 1:
                return "EXT-X-I-FRAMES-ONLY";
            case 2:
                return "EXT-X-PLAYLIST-TYPE";
            case 3:
                return "EXT-X-TARGETDURATION";
            case 4:
                return "EXT-X-MEDIA-SEQUENCE";
            default:
                return "EXT-X-ALLOW-CACHE";
        }
    }
}
