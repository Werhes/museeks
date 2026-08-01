package defpackage;

import androidx.car.app.adcel;
import androidx.car.app.messaging.model.ConversationItem;
import androidx.car.app.model.Action;
import androidx.car.app.model.CarIcon;
import androidx.car.app.model.CarText;
import androidx.car.app.model.Pane;
import androidx.car.app.model.PaneTemplate;
import androidx.car.app.model.Row;
import androidx.car.app.model.TemplateWrapper;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Collections;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙٖۤ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6436e implements InterfaceC16400e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public TemplateWrapper f13324e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public boolean f13326e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final C4891e f13327e = new C4891e(this, true);

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final C12582e f13325e = new C12582e(24);

    public C6436e(adcel adcelVar) {
        Objects.requireNonNull(adcelVar);
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [eٟؒ, java.lang.Object] */
    public final PaneTemplate license() {
        C18312e c18312e = new C18312e();
        CarText create = CarText.create("Hello, world!");
        if (create.isEmpty()) {
            throw new IllegalArgumentException("The title cannot be null or empty");
        }
        C8770e.purchase.vip(create);
        c18312e.ad = create;
        Row row = new Row(c18312e);
        C7707e c7707e = new C7707e();
        ArrayList arrayList = c7707e.ad;
        arrayList.add(row);
        if (arrayList.size() <= 0) {
            throw new IllegalStateException("The pane is set to loading but is not empty, or vice versa");
        }
        Pane pane = new Pane(c7707e);
        ?? obj = new Object();
        obj.ad = pane;
        Action action = Action.APP_ICON;
        C8778e c8778e = C8778e.advert;
        Objects.requireNonNull(action);
        c8778e.ad(Collections.singletonList(action));
        obj.vip = action;
        C17059e c17059e = C17059e.license;
        c17059e.getClass();
        int size = pane.getActions().size();
        int i = c17059e.ad;
        if (size > i) {
            throw new IllegalArgumentException(AbstractC1786e.admob(i, "The number of actions on the pane exceeded the supported max of "));
        }
        for (Row row2 : pane.getRows()) {
            if (row2 instanceof Row) {
                C0997e c0997e = c17059e.vip;
                Row row3 = row2;
                int i2 = c0997e.ad;
                if (!c0997e.appmetrica && row3.getOnClickDelegate() != null) {
                    throw new IllegalArgumentException("A click listener is not allowed on the row");
                }
                if (!c0997e.license && row3.getToggle() != null) {
                    throw new IllegalArgumentException("A toggle is not allowed on the row");
                }
                CarIcon image = row3.getImage();
                if (image != null) {
                    if (!c0997e.metrica) {
                        throw new IllegalArgumentException("An image is not allowed on the row");
                    }
                    c0997e.purchase.m3417native(image);
                }
                if (row3.getTexts().size() > i2) {
                    throw new IllegalArgumentException(AbstractC1786e.admob(i2, "The number of lines of texts for the row exceeded the supported max of "));
                }
            } else if (!(row2 instanceof ConversationItem)) {
                throw new IllegalArgumentException("Unsupported item type: ".concat(row2.getClass().getSimpleName()));
            }
        }
        C8778e.smaato.ad(pane.getActions());
        return new PaneTemplate(obj);
    }

    public final void metrica(EnumC14621e enumC14621e) {
        AbstractC14524e.vip(new RunnableC11247e(this, enumC14621e, 7));
    }

    @Override // defpackage.InterfaceC16400e
    public final AbstractC0003e vip() {
        return this.f13327e;
    }
}
