package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙؔ۟, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2421e implements InterfaceC16707e {
    public final String ad;
    public final String vip;

    public C2421e(String str, String str2) {
        this.ad = AbstractC3628e.isVip(str);
        this.vip = str2;
    }

    @Override // defpackage.InterfaceC16707e
    public final /* synthetic */ C16975e ad() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C2421e.class == obj.getClass()) {
            C2421e c2421e = (C2421e) obj;
            if (this.ad.equals(c2421e.ad) && this.vip.equals(c2421e.vip)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.vip.hashCode() + AbstractC1786e.advert(527, 31, this.ad);
    }

    @Override // defpackage.InterfaceC16707e
    public final /* synthetic */ byte[] metrica() {
        return null;
    }

    public final String toString() {
        return "VC: " + this.ad + "=" + this.vip;
    }

    @Override // defpackage.InterfaceC16707e
    public final void vip(C4761e c4761e) {
        String str = this.ad;
        str.getClass();
        char c = 65535;
        switch (str.hashCode()) {
            case -1935137620:
                if (str.equals("TOTALTRACKS")) {
                    c = 0;
                    break;
                }
                break;
            case -215998278:
                if (str.equals("TOTALDISCS")) {
                    c = 1;
                    break;
                }
                break;
            case -113312716:
                if (str.equals("TRACKNUMBER")) {
                    c = 2;
                    break;
                }
                break;
            case 62359119:
                if (str.equals("ALBUM")) {
                    c = 3;
                    break;
                }
                break;
            case 67703139:
                if (str.equals("GENRE")) {
                    c = 4;
                    break;
                }
                break;
            case 79833656:
                if (str.equals("TITLE")) {
                    c = 5;
                    break;
                }
                break;
            case 428414940:
                if (str.equals("DESCRIPTION")) {
                    c = 6;
                    break;
                }
                break;
            case 993300766:
                if (str.equals("DISCNUMBER")) {
                    c = 7;
                    break;
                }
                break;
            case 1746739798:
                if (str.equals("ALBUMARTIST")) {
                    c = '\b';
                    break;
                }
                break;
            case 1939198791:
                if (str.equals("ARTIST")) {
                    c = '\t';
                    break;
                }
                break;
        }
        String str2 = this.vip;
        switch (c) {
            case 0:
                Integer admob = AbstractC10509e.admob(str2);
                if (admob != null) {
                    c4761e.Signature = admob;
                    return;
                }
                return;
            case 1:
                Integer admob2 = AbstractC10509e.admob(str2);
                if (admob2 != null) {
                    c4761e.crashlytics = admob2;
                    return;
                }
                return;
            case 2:
                Integer admob3 = AbstractC10509e.admob(str2);
                if (admob3 != null) {
                    c4761e.loadAd = admob3;
                    return;
                }
                return;
            case 3:
                c4761e.metrica = str2;
                return;
            case 4:
                c4761e.firebase = str2;
                return;
            case 5:
                c4761e.ad = str2;
                return;
            case 6:
                c4761e.billing = str2;
                return;
            case 7:
                Integer admob4 = AbstractC10509e.admob(str2);
                if (admob4 != null) {
                    c4761e.subs = admob4;
                    return;
                }
                return;
            case '\b':
                c4761e.license = str2;
                return;
            case '\t':
                c4761e.vip = str2;
                return;
            default:
                return;
        }
    }
}
