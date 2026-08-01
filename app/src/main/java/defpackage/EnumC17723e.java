package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eْ٘ٗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public enum EnumC17723e implements InterfaceC7277e {
    TYPE_UNKNOWN(0),
    TYPE_CONTACT_INFO(1),
    TYPE_EMAIL(2),
    TYPE_ISBN(3),
    TYPE_PHONE(4),
    TYPE_PRODUCT(5),
    TYPE_SMS(6),
    TYPE_TEXT(7),
    TYPE_URL(8),
    TYPE_WIFI(9),
    TYPE_GEO(10),
    TYPE_CALENDAR_EVENT(11),
    TYPE_DRIVER_LICENSE(12);


    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final int f34756e;

    EnumC17723e(int i) {
        this.f34756e = i;
    }

    @Override // defpackage.InterfaceC7277e
    public final int ad() {
        return this.f34756e;
    }
}
