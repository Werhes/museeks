package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙٓؐ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C13676e implements Function1 {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC3314e f27096e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f27097e;

    public /* synthetic */ C13676e(InterfaceC3314e interfaceC3314e, int i) {
        this.f27097e = i;
        this.f27096e = interfaceC3314e;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f27097e) {
            case 0:
                this.f27096e.setValue((String) obj);
                return Unit.INSTANCE;
            case 1:
                this.f27096e.setValue(obj);
                return Unit.INSTANCE;
            case 2:
                this.f27096e.setValue(Boolean.valueOf(((EnumC16488e) obj).ad()));
                return Unit.INSTANCE;
            case 3:
                ((Function1) this.f27096e.getValue()).invoke((C2152e) obj);
                return Unit.INSTANCE;
            case 4:
                String str = (String) obj;
                StringBuilder sb = new StringBuilder();
                int length = str.length();
                for (int i = 0; i < length; i++) {
                    char charAt = str.charAt(i);
                    if (('0' <= charAt && charAt < ':') || (('a' <= charAt && charAt < 'g') || ('A' <= charAt && charAt < 'G'))) {
                        sb.append(charAt);
                    }
                }
                this.f27096e.setValue(sb.toString());
                return Unit.INSTANCE;
            case 5:
                this.f27096e.setValue((C15036e) obj);
                return Unit.INSTANCE;
            case 6:
                this.f27096e.setValue(new C2152e(((InterfaceC0043e) obj).Signature(0L)));
                return Unit.INSTANCE;
            default:
                this.f27096e.setValue((InterfaceC0043e) obj);
                return Unit.INSTANCE;
        }
    }
}
