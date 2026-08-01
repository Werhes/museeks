package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَؙؖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C6301e extends AbstractC8408e {

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f13129e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C6301e(int i, String str, Throwable th) {
        super(str, th);
        this.f13129e = i;
    }

    @Override // java.lang.Throwable
    public final String toString() {
        switch (this.f13129e) {
            case 0:
                return "BsonInvalidOperationException(message=" + getMessage() + ", cause=" + getCause() + ')';
            default:
                StringBuilder sb = new StringBuilder("BsonSerializationException(message=");
                sb.append(getMessage());
                sb.append(", cause=");
                Throwable cause = getCause();
                return AbstractC4653e.applovin(sb, cause != null ? cause.getMessage() : null, ')');
        }
    }
}
