package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘٗۜ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC5689e extends AbstractC14985e {

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public static final byte[] f12083e = new byte[0];

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public static final AbstractC12614e f12082e = AbstractC12614e.remoteconfig(EnumC8271e.ALBUM, EnumC8271e.ARTIST, EnumC8271e.TITLE, EnumC8271e.TRACK, EnumC8271e.GENRE, EnumC8271e.COMMENT, EnumC8271e.YEAR);

    @Override // defpackage.InterfaceC9354e
    public final InterfaceC3589e ad(EnumC8271e enumC8271e, String... strArr) {
        AbstractC5542e.license(enumC8271e, "genericKey");
        if (amazon().contains(enumC8271e)) {
            return new C18096e(enumC8271e.name(), (String) AbstractC5542e.appmetrica(strArr));
        }
        throw new C14803e(enumC8271e.name(), 17, (byte) 0);
    }

    @Override // defpackage.InterfaceC9354e
    public final InterfaceC3589e advert(AbstractC13977e abstractC13977e) {
        throw new C14803e("COVER_ART", 17, (byte) 0);
    }

    @Override // defpackage.InterfaceC9354e
    public AbstractC12614e amazon() {
        return f12082e;
    }

    @Override // defpackage.InterfaceC9354e
    public final AbstractC9621e appmetrica(EnumC8271e enumC8271e) {
        AbstractC5542e.license(enumC8271e, "genericKey");
        return remoteconfig(enumC8271e.name());
    }
}
