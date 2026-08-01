package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَؖؑ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C3814e implements Function1 {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ C16330e f8440e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f8441e;

    public /* synthetic */ C3814e(C16330e c16330e, int i) {
        this.f8441e = i;
        this.f8440e = c16330e;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f8441e) {
            case 0:
                String str = (String) obj;
                StringBuilder sb = new StringBuilder();
                int length = str.length();
                for (int i = 0; i < length; i++) {
                    char charAt = str.charAt(i);
                    if (Character.isDigit(charAt)) {
                        sb.append(charAt);
                    }
                }
                Integer signatures = AbstractC6507e.signatures(sb.toString());
                this.f8440e.startapp(signatures != null ? signatures.intValue() : 0);
                return Unit.INSTANCE;
            default:
                this.f8440e.startapp(((Integer) obj).intValue());
                return Unit.INSTANCE;
        }
    }
}
