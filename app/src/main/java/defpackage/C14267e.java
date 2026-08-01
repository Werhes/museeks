package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٓ۟ٝ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C14267e extends AbstractC5689e {

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public static final AbstractC12614e f28201e = AbstractC12614e.remoteconfig(EnumC8271e.ALBUM, EnumC8271e.ARTIST, EnumC8271e.ALBUM_ARTIST, EnumC8271e.TITLE, EnumC8271e.TRACK, EnumC8271e.GENRE, EnumC8271e.COMMENT, EnumC8271e.YEAR, EnumC8271e.RECORD_LABEL, EnumC8271e.ISRC, EnumC8271e.COMPOSER, EnumC8271e.LYRICIST, EnumC8271e.ENCODER, EnumC8271e.CONDUCTOR, EnumC8271e.RATING);

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final ArrayList f28204e = new ArrayList();

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public Long f28203e = null;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public Long f28202e = null;

    @Override // defpackage.AbstractC5689e, defpackage.InterfaceC9354e
    public final AbstractC12614e amazon() {
        return f28201e;
    }

    public final long pro() {
        Long l = this.f28202e;
        if (l == null || this.f28203e == null) {
            return 0L;
        }
        return (l.longValue() - this.f28203e.longValue()) - 8;
    }

    @Override // defpackage.AbstractC14985e
    public final String toString() {
        StringBuilder sb = new StringBuilder("Wav Info Tag:\n");
        if (this.f28203e != null) {
            sb.append("\tstartLocation:");
            sb.append(AbstractC6069e.ad(this.f28203e.longValue()));
            sb.append("\n");
        }
        if (this.f28202e != null) {
            sb.append("\tendLocation:");
            sb.append(AbstractC6069e.ad(this.f28202e.longValue()));
            sb.append("\n");
        }
        sb.append(super.toString());
        ArrayList arrayList = this.f28204e;
        if (arrayList.size() > 0) {
            sb.append("\nUnrecognized Tags:\n");
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                InterfaceC16681e interfaceC16681e = (InterfaceC16681e) it.next();
                sb.append("\t");
                sb.append(interfaceC16681e.getId());
                sb.append(":");
                sb.append(interfaceC16681e.yandex());
                sb.append("\n");
            }
        }
        return sb.toString();
    }
}
